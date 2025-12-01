package librarymanager;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Library {

 private Map<String, Book> booksByIsbn = new HashMap<>();
 private Map<Integer, Member> membersById = new HashMap<>();
 private List<IssueRecord> issues = new ArrayList<>();
 private int nextIssueId = 1;

 // ---- Book operations ----
 public void addBook(Book b) {
     if (booksByIsbn.containsKey(b.getIsbn())) {
         // if exists, just update total copies
         Book existing = booksByIsbn.get(b.getIsbn());
         existing.setTotalCopies(existing.getTotalCopies() + b.getTotalCopies());
         existing.setAvailableCopies(existing.getAvailableCopies() + b.getAvailableCopies());
     } else {
         booksByIsbn.put(b.getIsbn(), b);
     }
 }

 public Book searchByIsbn(String isbn) {
     return booksByIsbn.get(isbn);
 }

 public List<Book> searchByTitle(String title) {
     List<Book> result = new ArrayList<>();
     String q = title.toLowerCase();
     for (Book b : booksByIsbn.values()) {
         if (b.getTitle().toLowerCase().contains(q)) {
             result.add(b);
         }
     }
     return result;
 }

 public List<Book> listAllBooks() {
     return new ArrayList<>(booksByIsbn.values());
 }

 // ---- Member operations ----
 public void registerMember(Member m) {
     membersById.put(m.getMemberId(), m);
 }

 public Member getMember(int memberId) {
     return membersById.get(memberId);
 }

 // ---- Issue / Return ----
 public void issueBook(String isbn, int memberId) throws Exception {
     Book b = booksByIsbn.get(isbn);
     if (b == null) {
         throw new Exception("Book not found.");
     }
     if (b.getAvailableCopies() <= 0) {
         throw new Exception("No copies available.");
     }

     Member m = membersById.get(memberId);
     if (m == null) {
         throw new Exception("Member not found.");
     }

     b.setAvailableCopies(b.getAvailableCopies() - 1);

     LocalDate issueDate = LocalDate.now();
     LocalDate dueDate = issueDate.plusDays(14);

     IssueRecord record = new IssueRecord(nextIssueId++, isbn, memberId, issueDate, dueDate);
     issues.add(record);
     m.addToHistory(record);
 }

 public void returnBook(int issueId) throws Exception {
     IssueRecord record = null;
     for (IssueRecord r : issues) {
         if (r.getId() == issueId) {
             record = r;
             break;
         }
     }
     if (record == null) {
         throw new Exception("Issue record not found.");
     }
     if (record.isReturned()) {
         throw new Exception("Book already returned.");
     }

     record.markReturned(LocalDate.now());

     Book b = booksByIsbn.get(record.getIsbn());
     if (b != null) {
         b.setAvailableCopies(b.getAvailableCopies() + 1);
     }
 }

 public List<IssueRecord> getIssues() {
     return issues;
 }

 // ---- Simple serialization (Option B) ----
 public void saveData() throws IOException {
     try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("library.dat"))) {
         oos.writeObject(booksByIsbn);
         oos.writeObject(membersById);
         oos.writeObject(issues);
         oos.writeInt(nextIssueId);
     }
 }

 @SuppressWarnings("unchecked")
 public void loadData() {
     File f = new File("library.dat");
     if (!f.exists()) {
         return; // first run
     }
     try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
         booksByIsbn = (Map<String, Book>) ois.readObject();
         membersById = (Map<Integer, Member>) ois.readObject();
         issues = (List<IssueRecord>) ois.readObject();
         nextIssueId = ois.readInt();
     } catch (Exception e) {
         System.out.println("Error loading data: " + e.getMessage());
     }
 }
}

