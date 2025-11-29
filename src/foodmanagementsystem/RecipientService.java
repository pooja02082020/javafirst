package foodmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class RecipientService {

    Scanner sc = new Scanner(System.in);
    ArrayList<Recipient> requests = new ArrayList<>();

    public void recipientMenu() {
        int choice;

        do {
            System.out.println("\n===== RECIPIENT MENU =====");
            System.out.println("1. Request Food");
            System.out.println("2. View My Requests");
            System.out.println("3. Back");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> requestFood();
                case 2 -> viewRequests();
                case 3 -> {}
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 3);
    }

    public void requestFood() {
        System.out.print("Enter recipient ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        requests.add(new Recipient(id, name));
        System.out.println("Food request submitted!");
    }

    public void viewRequests() {
        System.out.println("\n===== MY REQUESTS =====");
        if (requests.isEmpty()) {
            System.out.println("No requests found.");
        } else {
            for (Recipient r : requests) {
                System.out.println(r.getId() + " - " + r.getName());
            }
        }
    }
}
