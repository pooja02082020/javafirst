package librarymanager;

import java.util.List;
import java.util.Scanner;

public class LibraryApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Library lib = new Library();
		lib.loadData();

		int choice;
		do {
			System.out.println("\n===== LIBRARY MANAGER =====");
			System.out.println("1. Add Book");
			System.out.println("2. List Books");
			System.out.println("3. Register Member");
			System.out.println("4. Issue Book");
			System.out.println("5. Return Book");
			System.out.println("6. List Issued Books");
			System.out.println("0. Save & Exit");
			System.out.print("Enter choice: ");

			choice = readInt(sc);

			try {
				switch (choice) {
				case 1 -> addBookMenu(sc, lib);
				case 2 -> listBooksMenu(lib);
				case 3 -> registerMemberMenu(sc, lib);
				case 4 -> issueBookMenu(sc, lib);
				case 5 -> returnBookMenu(sc, lib);
				case 6 -> listIssuesMenu(lib);
				case 0 -> {
					lib.saveData();
					System.out.println("Data saved. Exiting...");
				}
				default -> System.out.println("Invalid choice.");
				}
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}

		} while (choice != 0);

		sc.close();
	}

	private static int readInt(Scanner sc) {
		while (true) {
			try {
				int value = Integer.parseInt(sc.nextLine());
				return value;
			} catch (NumberFormatException e) {
				System.out.print("Invalid number. Re-enter: ");
			}
		}
	}

	private static void addBookMenu(Scanner sc, Library lib) {
		System.out.print("ISBN: ");
		String isbn = sc.nextLine();
		System.out.print("Title: ");
		String title = sc.nextLine();
		System.out.print("Author: ");
		String author = sc.nextLine();
		System.out.print("Category: ");
		String category = sc.nextLine();
		System.out.print("Year: ");
		int year = readInt(sc);
		System.out.print("Total copies: ");
		int total = readInt(sc);

		Book b = new Book(isbn, title, author, category, total, total, year);
		lib.addBook(b);
		System.out.println("Book added/updated.");
	}

	private static void listBooksMenu(Library lib) {
		List<Book> books = lib.listAllBooks();
		if (books.isEmpty()) {
			System.out.println("No books in library.");
		} else {
			for (Book b : books) {
				System.out.println(b);
			}
		}
	}

	private static void registerMemberMenu(Scanner sc, Library lib) {
		System.out.print("Member ID: ");
		int id = readInt(sc);
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Phone: ");
		String phone = sc.nextLine();

		Member m = new Member(id, name, email, phone);
		lib.registerMember(m);
		System.out.println("Member registered.");
	}

	private static void issueBookMenu(Scanner sc, Library lib) throws Exception {
		System.out.print("ISBN to issue: ");
		String isbn = sc.nextLine();
		System.out.print("Member ID: ");
		int memberId = readInt(sc);

		lib.issueBook(isbn, memberId);
		System.out.println("Book issued.");
	}

	private static void returnBookMenu(Scanner sc, Library lib) throws Exception {
		System.out.print("Issue ID to return: ");
		int issueId = readInt(sc);
		lib.returnBook(issueId);
		System.out.println("Book returned.");
	}

	private static void listIssuesMenu(Library lib) {
		List<IssueRecord> issues = lib.getIssues();
		if (issues.isEmpty()) {
			System.out.println("No issues found.");
		} else {
			for (IssueRecord r : issues) {
				System.out.println(r);
			}
		}
	}
}
