package librarymanager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Member implements Serializable {
    private static final long serialVersionUID = 1L;

    private int memberId;
    private String name;
    private String email;
    private String phone;
    private List<IssueRecord> history = new ArrayList<>();

    public Member(int memberId, String name, String email, String phone) {
        this.memberId = memberId;
        this.name = name.trim();
        this.email = email.trim();
        this.phone = phone.trim();
    }

    public int getMemberId() { return memberId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public List<IssueRecord> getHistory() { return history; }

    public void setName(String name) { this.name = name.trim(); }
    public void setEmail(String email) { this.email = email.trim(); }
    public void setPhone(String phone) { this.phone = phone.trim(); }

    public void addIssueToHistory(IssueRecord record) {
        history.add(record);
    }

    @Override
    public String toString() {
        return "MemberId: " + memberId +
                ", Name: " + name +
                ", Email: " + email +
                ", Phone: " + phone;
    }
}
