package foodmanagementsystem;

import java.util.Scanner;

public class AdminService {

    Scanner sc = new Scanner(System.in);
    Admin admin = new Admin();
    boolean isLoggedIn = false;

    UserService userService = new UserService();

    public void adminLogIn() {

        do {
            System.out.print("Enter admin username: ");
            String user = sc.nextLine();

            System.out.print("Enter admin password: ");
            String pass = sc.nextLine();

            if (user.equals(admin.username) && pass.equals(admin.password)) {
                System.out.println("\nLogin successful!\n");
                isLoggedIn = true;
                adminDashboard();
            } else {
                System.out.println("Invalid admin credentials!");
            }

        } while (!isLoggedIn);
    }

    public void adminDashboard() {
        int choice;

        do {
            System.out.println("\n===== ADMIN DASHBOARD =====");
            System.out.println("1. View Users");
            System.out.println("2. View Donations");
            System.out.println("3. Logout");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> userService.viewUsers();
                case 2 -> DonationService.viewAllDonationsStatic();
                case 3 -> System.out.println("Logged out!\n");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 3);
    }
}
