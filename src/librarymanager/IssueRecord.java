package librarymanager;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class IssueRecord implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String isbn;
    private int memberId;
    private LocalDate issueDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
    private double fine;

    public IssueRecord(int id, String isbn, int memberId, LocalDate issueDate, LocalDate dueDate) {
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

    public void returnNow() {
        if (isReturned()) return;
        this.returnDate = LocalDate.now();
        this.fine = calculateFine();
    }

    private double calculateFine() {
        if (returnDate == null || !returnDate.isAfter(dueDate)) {
            return 0.0;
        }
        long daysLate = ChronoUnit.DAYS.between(dueDate, returnDate);
        return daysLate * 10.0; // Rs 10 per day (example)
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
