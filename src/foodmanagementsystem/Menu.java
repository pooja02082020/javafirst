package foodmanagementsystem;

import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);

    AdminService adminService = new AdminService();
    UserService userService = new UserService();
    DonationService donationService = new DonationService();
    RecipientService recipientService = new RecipientService();

    public void showMainMenu() {
        int choice;

        do {
            System.out.println("\n===== FOOD DONATION SYSTEM =====");
            System.out.println("1. Admin Login");
            System.out.println("2. User Menu");
            System.out.println("3. Recipient Menu");
            System.out.println("4. Donation Menu");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> adminService.adminLogIn();
                case 2 -> userService.userMenu();
                case 3 -> recipientService.recipientMenu();
                case 4 -> donationService.donationMenu();
                case 5 -> System.out.println("Thank you!");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }
}
