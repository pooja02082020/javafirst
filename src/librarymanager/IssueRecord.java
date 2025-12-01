package librarymanager;

//IssueRecord.java
import java.io.Serializable;
import java.time.LocalDate;

public class IssueRecord implements Serializable {

 private int id;
 private String isbn;
 private int memberId;
 private LocalDate issueDate;
 private LocalDate dueDate;
 private LocalDate returnDate;
 private double fine;

 public IssueRecord(int id, String isbn, int memberId,
                    LocalDate issueDate, LocalDate dueDate) {
     this.id = id;
     this.isbn = isbn;
     this.memberId = memberId;
     this.issueDate = issueDate;
     this.dueDate = dueDate;
 }

 public int getId() { return id; }
 public String getIsbn() { return isbn; }
 public int getMemberId() { return memberId; }
 public LocalDate getIssueDate() { return issueDate; }
 public LocalDate getDueDate() { return dueDate; }
 public LocalDate getReturnDate() { return returnDate; }
 public double getFine() { return fine; }

 public boolean isReturned() {
     return returnDate != null;
 }

 public void markReturned(LocalDate returnDate) {
     this.returnDate = returnDate;
     calculateFine();
 }

 // Very simple fine logic: 10 per late day
 public void calculateFine() {
     if (returnDate == null || !returnDate.isAfter(dueDate)) {
         fine = 0;
     } else {
         long daysLate = java.time.temporal.ChronoUnit.DAYS.between(dueDate, returnDate);
         fine = daysLate * 10.0;
     }
 }

 @Override
 public String toString() {
     return "IssueId: " + id +
             ", ISBN: " + isbn +
             ", MemberId: " + memberId +
             ", IssueDate: " + issueDate +
             ", DueDate: " + dueDate +
             ", ReturnDate: " + returnDate +
             ", Fine: " + fine;
 }
}
