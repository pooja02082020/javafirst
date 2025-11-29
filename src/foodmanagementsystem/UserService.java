package foodmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {

    Scanner sc = new Scanner(System.in);
    ArrayList<User> users = new ArrayList<>();

    public void userMenu() {
        int choice;

        do {
            System.out.println("\n===== USER MENU =====");
            System.out.println("1. Register User");
            System.out.println("2. View All Donations");
            System.out.println("3. Back");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> registerUser();
                case 2 -> DonationService.viewAllDonationsStatic();
                case 3 -> {}
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 3);
    }

    public void registerUser() {
        System.out.print("Enter user id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        users.add(new User(id, name, email));
        System.out.println("User registered successfully!");
    }

    public void viewUsers() {
        System.out.println("\n===== ALL USERS =====");
        if (users.isEmpty()) {
            System.out.println("No users found.");
        } else {
            for (User u : users) {
            	System.out.println(u.getId() + " - " + u.getName() + " (" + u.getEmail() + ")");
            }
        }
    }
}
