package oopsbasics;

class User {
    private String username;
    private String password;

    public void setUsername(String username) {
        if(username.length() < 3) {
            System.out.println("Username must be at least 3 characters");
        } else {
            this.username = username;
        }
    }

    public void setPassword(String password) {
        if(password.length() < 6) {
            System.out.println("Password must be at least 6 characters");
        } else {
            this.password = password;
        }
    }

    public String getUsername() {
        return username;
    }
}

public class EncapsulationAdvanced {
    public static void main(String[] args) {
        User u = new User();
        u.setUsername("po");
        u.setPassword("123");

        u.setUsername("pooja");
        u.setPassword("secure123");

        System.out.println("Username stored: " + u.getUsername());
    }
}
