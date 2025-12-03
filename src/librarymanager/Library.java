package librarymanager;

import java.time.LocalDate;
import java.util.*;
import java.util.regex.Pattern;

public class Library {

    private Map<String, Book> booksByIsbn = new HashMap<>();
    private Map<Integer, Member> membersById = new HashMap<>();
    private List<IssueRecord> issues = new ArrayList<>();

    private static final String BOOKS_FILE = "books.ser";
    private static final String MEMBERS_FILE = "members.ser";
    private static final String ISSUES_FILE = "issues.ser";

    public Library() {
        loadData();
    }

    // ---------- Persistence ----------

    public void loadData() {
        Map<String, Book> loadedBooks = FileUtil.loadBooks(BOOKS_FILE);
        if (loadedBooks != null) booksByIsbn = loadedBooks;

        Map<Integer, Member> loadedMembers = FileUtil.loadMembers(MEMBERS_FILE);
        if (loadedMembers != null) membersById = loadedMembers;

        List<IssueRecord> loadedIssues = FileUtil.loadIssues(ISSUES_FILE);
        if (loadedIssues != null) issues = loadedIssues;
    }

    public void saveData() {
        FileUtil.saveBooks(BOOKS_FILE, booksByIsbn);
        FileUtil.saveMembers(MEMBERS_FILE, membersById);
        FileUtil.saveIssues(ISSUES_FILE, issues);
    }

    // ---------- Helpers for IDs ----------

    private int getNextMemberId() {
        return membersById.keySet().stream().max(Integer::compareTo).orElse(0) + 1;
    }

    private int getNextIssueId() {
        return issues.stream().map(IssueRecord::getId).max(Integer::compareTo).orElse(0) + 1;
    }

    // ---------- Book operations ----------

    public boolean addBook(Book b) {
        if (booksByIsbn.containsKey(b.getIsbn())) {
            System.out.println("Book with this ISBN already exists. Updating copies instead.");
            Book existing = booksByIsbn.get(b.getIsbn());
            int newTotal = existing.getTotalCopies() + b.getTotalCopies();
            existing.setTotalCopies(newTotal);
            existing.setAvailableCopies(existing.getAvailableCopies() + b.getTotalCopies());
            return false;
        } else {
            booksByIsbn.put(b.getIsbn(), b);
            return true;
        }
    }

    public Book getBookByIsbn(String isbn) {
        return booksByIsbn.get(isbn);
    }

    public boolean updateBook(String isbn, String title, String author,
                              String category, Integer totalCopies, Integer year) {
        Book b = booksByIsbn.get(isbn);
        if (b == null) return false;

        if (title != null && !title.isBlank()) b.setTitle(title);
        if (author != null && !author.isBlank()) b.setAuthor(author);
        if (category != null && !category.isBlank()) b.setCategory(category);
        if (totalCopies != null && totalCopies >= 0) b.setTotalCopies(totalCopies);
        if (year != null && year > 0) b.setYear(year);

        return true;
    }

    public boolean deleteBook(String isbn) {
        Book b = booksByIsbn.get(isbn);
        if (b == null) return false;

        // cannot delete if some copies are issued
        if (b.getAvailableCopies() != b.getTotalCopies()) {
            System.out.println("Cannot delete. Some copies are currently issued.");
            return false;
        }
        booksByIsbn.remove(isbn);
        return true;
    }

    public List<Book> listAllBooks() {
        return new ArrayList<>(booksByIsbn.values());
    }

    public List<Book> listAvailableBooks() {
        List<Book> result = new ArrayList<>();
        for (Book b : booksByIsbn.values()) {
            if (b.isAvailable()) result.add(b);
        }
        return result;
    }

    public List<Book> listByAuthor(String author) {
        String a = author.toLowerCase();
        List<Book> result = new ArrayList<>();
        for (Book b : booksByIsbn.values()) {
            if (b.getAuthor().toLowerCase().contains(a)) {
                result.add(b);
            }
        }
        return result;
    }

    public List<Book> listByCategory(String category) {
        String c = category.toLowerCase();
        List<Book> result = new ArrayList<>();
        for (Book b : booksByIsbn.values()) {
            if (b.getCategory().toLowerCase().contains(c)) {
                result.add(b);
            }
        }
        return result;
    }

    public List<Book> searchByTitle(String title) {
        String t = title.toLowerCase();
        List<Book> result = new ArrayList<>();
        for (Book b : booksByIsbn.values()) {
            if (b.getTitle().toLowerCase().contains(t)) {
                result.add(b);
            }
        }
        return result;
    }

    // ---------- Member operations ----------

    public Member registerMember(String name, String email, String phone) {
        if (name == null || name.isBlank()) {
            System.out.println("Name cannot be empty.");
            return null;
        }
        if (!isValidEmail(email)) {
            System.out.println("Invalid email address.");
            return null;
        }
        int id = getNextMemberId();
        Member m = new Member(id, name, email, phone);
        membersById.put(id, m);
        return m;
    }

    private boolean isValidEmail(String email) {
        if (email == null) return false;
        String regex = "^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,}$";
        return Pattern.matches(regex, email);
    }

    public Member getMemberById(int id) {
        return membersById.get(id);
    }

    public boolean updateMember(int id, String name, String email, String phone) {
        Member m = membersById.get(id);
        if (m == null) return false;

        if (name != null && !name.isBlank()) m.setName(name);
        if (email != null && !email.isBlank()) {
            if (isValidEmail(email)) m.setEmail(email);
            else System.out.println("Invalid email. Keeping old.");
        }
        if (phone != null && !phone.isBlank()) m.setPhone(phone);
        return true;
    }

    public boolean deleteMember(int id) {
        Member m = membersById.get(id);
        if (m == null) return false;

        // Optional: prevent delete if member has unreturned books
        for (IssueRecord r : issues) {
            if (r.getMemberId() == id && !r.isReturned()) {
                System.out.println("Cannot delete member with unreturned books.");
                return false;
            }
        }

        membersById.remove(id);
        return true;
    }

    public List<Member> listMembers() {
        return new ArrayList<>(membersById.values());
    }

    public List<IssueRecord> getMemberHistory(int memberId) {
        Member m = membersById.get(memberId);
        if (m == null) return Collections.emptyList();
        return m.getHistory();
    }

    // ---------- Issue / Return operations ----------

    public IssueRecord issueBook(String isbn, int memberId) {
        Book b = booksByIsbn.get(isbn);
        if (b == null) {
            System.out.println("Book not found.");
            return null;
        }
        if (!b.isAvailable()) {
            System.out.println("No available copies to issue.");
            return null;
        }

        Member m = membersById.get(memberId);
        if (m == null) {
            System.out.println("Member not found.");
            return null;
        }

        b.setAvailableCopies(b.getAvailableCopies() - 1);

        LocalDate issueDate = LocalDate.now();
        LocalDate dueDate = issueDate.plusDays(14);
        int issueId = getNextIssueId();

        IssueRecord record = new IssueRecord(issueId, isbn, memberId, issueDate, dueDate);
        issues.add(record);
        m.addIssueToHistory(record);

        return record;
    }

    public boolean returnBook(int issueId) {
        IssueRecord record = null;
        for (IssueRecord r : issues) {
            if (r.getId() == issueId) {
                record = r;
                break;
            }
        }
        if (record == null) {
            System.out.println("Issue record not found.");
            return false;
        }
        if (record.isReturned()) {
            System.out.println("This book is already returned.");
            return false;
        }

        record.returnNow();

        Book b = booksByIsbn.get(record.getIsbn());
        if (b != null) {
            b.setAvailableCopies(b.getAvailableCopies() + 1);
        }

        System.out.println("Book returned. Fine: " + record.getFine());
        return true;
    }

    public List<IssueRecord> listIssuedBooks() {
        List<IssueRecord> active = new ArrayList<>();
        for (IssueRecord r : issues) {
            if (!r.isReturned()) active.add(r);
        }
        return active;
    }

    public List<IssueRecord> getAllIssues() {
        return new ArrayList<>(issues);
    }
}
