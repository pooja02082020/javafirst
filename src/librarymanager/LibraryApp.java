package librarymanager;

import java.util.List;
import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        int choice;
        do {
            System.out.println("\n===== LIBRARY MANAGER =====");
            System.out.println("1. Add Book");
            System.out.println("2. Update Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Search Book by Title");
            System.out.println("5. List All Books");
            System.out.println("6. List Available Books");
            System.out.println("7. List Books by Author");
            System.out.println("8. List Books by Category");
            System.out.println("9. Register Member");
            System.out.println("10. Update Member");
            System.out.println("11. Delete Member");
            System.out.println("12. List Members");
            System.out.println("13. Issue Book");
            System.out.println("14. Return Book");
            System.out.println("15. List Issued Books");
            System.out.println("16. View Member History");
            System.out.println("0. Save & Exit");
            System.out.print("Enter choice: ");

            choice = readInt(sc);

            switch (choice) {
                case 1 -> addBookUI(sc, lib);
                case 2 -> updateBookUI(sc, lib);
                case 3 -> deleteBookUI(sc, lib);
                case 4 -> searchBookByTitleUI(sc, lib);
                case 5 -> listBooks(lib.listAllBooks());
                case 6 -> listBooks(lib.listAvailableBooks());
                case 7 -> listBooksByAuthorUI(sc, lib);
                case 8 -> listBooksByCategoryUI(sc, lib);
                case 9 -> registerMemberUI(sc, lib);
                case 10 -> updateMemberUI(sc, lib);
                case 11 -> deleteMemberUI(sc, lib);
                case 12 -> listMembersUI(lib);
                case 13 -> issueBookUI(sc, lib);
                case 14 -> returnBookUI(sc, lib);
                case 15 -> listIssuedBooksUI(lib);
                case 16 -> memberHistoryUI(sc, lib);
                case 0 -> {
                    System.out.println("Saving data...");
                    lib.saveData();
                    System.out.println("Goodbye!");
                }
                default -> System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }

    private static int readInt(Scanner sc) {
        while (true) {
            try {
                String line = sc.nextLine();
                return Integer.parseInt(line.trim());
            } catch (NumberFormatException e) {
                System.out.print("Invalid number. Re-enter: ");
            }
        }
    }

    // ---------- UI helpers ----------

    private static void addBookUI(Scanner sc, Library lib) {
        System.out.print("ISBN: ");
        String isbn = sc.nextLine().trim();
        System.out.print("Title: ");
        String title = sc.nextLine().trim();
        System.out.print("Author: ");
        String author = sc.nextLine().trim();
        System.out.print("Category: ");
        String category = sc.nextLine().trim();
        System.out.print("Total copies: ");
        int copies = readInt(sc);
        System.out.print("Year: ");
        int year = readInt(sc);

        Book b = new Book(isbn, title, author, category, copies, year);
        boolean added = lib.addBook(b);
        if (added) System.out.println("Book added.");
        else System.out.println("Existing book updated with more copies.");
    }

    private static void updateBookUI(Scanner sc, Library lib) {
        System.out.print("Enter ISBN of book to update: ");
        String isbn = sc.nextLine().trim();
        Book b = lib.getBookByIsbn(isbn);
        if (b == null) {
            System.out.println("Book not found.");
            return;
        }
        System.out.println("Current details: " + b);

        System.out.print("New title (Enter to skip): ");
        String title = sc.nextLine();
        System.out.print("New author (Enter to skip): ");
        String author = sc.nextLine();
        System.out.print("New category (Enter to skip): ");
        String category = sc.nextLine();

        System.out.print("New total copies (-1 to skip): ");
        int tc = readInt(sc);
        Integer totalCopies = (tc >= 0) ? tc : null;

        System.out.print("New year (-1 to skip): ");
        int yr = readInt(sc);
        Integer year = (yr >= 0) ? yr : null;

        boolean ok = lib.updateBook(isbn, title, author, category, totalCopies, year);
        if (ok) System.out.println("Book updated.");
        else System.out.println("Failed to update.");
    }

    private static void deleteBookUI(Scanner sc, Library lib) {
        System.out.print("Enter ISBN to delete: ");
        String isbn = sc.nextLine().trim();
        boolean ok = lib.deleteBook(isbn);
        if (ok) System.out.println("Book deleted.");
        else System.out.println("Could not delete book.");
    }

    private static void searchBookByTitleUI(Scanner sc, Library lib) {
        System.out.print("Enter title to search: ");
        String title = sc.nextLine().trim();
        List<Book> found = lib.searchByTitle(title);
        listBooks(found);
    }

    private static void listBooksByAuthorUI(Scanner sc, Library lib) {
        System.out.print("Enter author: ");
        String author = sc.nextLine().trim();
        listBooks(lib.listByAuthor(author));
    }

    private static void listBooksByCategoryUI(Scanner sc, Library lib) {
        System.out.print("Enter category: ");
        String cat = sc.nextLine().trim();
        listBooks(lib.listByCategory(cat));
    }

    private static void listBooks(List<Book> books) {
        if (books == null || books.isEmpty()) {
            System.out.println("No books found.");
            return;
        }
        for (Book b : books) {
            System.out.println(b);
        }
    }

    private static void registerMemberUI(Scanner sc, Library lib) {
        System.out.print("Name: ");
        String name = sc.nextLine().trim();
        System.out.print("Email: ");
        String email = sc.nextLine().trim();
        System.out.print("Phone: ");
        String phone = sc.nextLine().trim();

        Member m = lib.registerMember(name, email, phone);
        if (m != null) {
            System.out.println("Member registered: " + m);
        } else {
            System.out.println("Failed to register member.");
        }
    }

    private static void updateMemberUI(Scanner sc, Library lib) {
        System.out.print("Enter member ID to update: ");
        int id = readInt(sc);
        Member m = lib.getMemberById(id);
        if (m == null) {
            System.out.println("Member not found.");
            return;
        }
        System.out.println("Current: " + m);

        System.out.print("New name (Enter to skip): ");
        String name = sc.nextLine();
        System.out.print("New email (Enter to skip): ");
        String email = sc.nextLine();
        System.out.print("New phone (Enter to skip): ");
        String phone = sc.nextLine();

        boolean ok = lib.updateMember(id, name, email, phone);
        if (ok) System.out.println("Member updated.");
        else System.out.println("Update failed.");
    }

    private static void deleteMemberUI(Scanner sc, Library lib) {
        System.out.print("Enter member ID to delete: ");
        int id = readInt(sc);
        boolean ok = lib.deleteMember(id);
        if (ok) System.out.println("Member deleted.");
        else System.out.println("Could not delete member.");
    }

    private static void listMembersUI(Library lib) {
        List<Member> members = lib.listMembers();
        if (members.isEmpty()) {
            System.out.println("No members found.");
            return;
        }
        for (Member m : members) {
            System.out.println(m);
        }
    }

    private static void issueBookUI(Scanner sc, Library lib) {
        System.out.print("Enter ISBN to issue: ");
        String isbn = sc.nextLine().trim();
        System.out.print("Enter member ID: ");
        int memberId = readInt(sc);

        IssueRecord r = lib.issueBook(isbn, memberId);
        if (r != null) {
            System.out.println("Book issued: " + r);
        } else {
            System.out.println("Issue failed.");
        }
    }

    private static void returnBookUI(Scanner sc, Library lib) {
        System.out.print("Enter issue ID to return: ");
        int id = readInt(sc);
        boolean ok = lib.returnBook(id);
        if (!ok) {
            System.out.println("Return failed.");
        }
    }

    private static void listIssuedBooksUI(Library lib) {
        List<IssueRecord> active = lib.listIssuedBooks();
        if (active.isEmpty()) {
            System.out.println("No active issues.");
            return;
        }
        for (IssueRecord r : active) {
            System.out.println(r);
        }
    }

    private static void memberHistoryUI(Scanner sc, Library lib) {
        System.out.print("Enter member ID: ");
        int id = readInt(sc);
        List<IssueRecord> hist = lib.getMemberHistory(id);
        if (hist.isEmpty()) {
            System.out.println("No history or member not found.");
            return;
        }
        for (IssueRecord r : hist) {
            System.out.println(r);
        }
    }
}
