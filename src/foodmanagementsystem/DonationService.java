package foodmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class DonationService {

    Scanner sc = new Scanner(System.in);
    public static ArrayList<Donation> donations = new ArrayList<>();

    public void donationMenu() {
        int choice;

        do {
            System.out.println("\n===== DONATION MENU =====");
            System.out.println("1. Add Donation");
            System.out.println("2. View All Donations");
            System.out.println("3. Back");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addDonation();
                case 2 -> viewAllDonations();
                case 3 -> {}
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 3);
    }

    public void addDonation() {
        System.out.print("Enter donation ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter food item: ");
        String item = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        donations.add(new Donation(id, item, qty));
        System.out.println("Donation added successfully!");
    }

    public void viewAllDonations() {
        viewAllDonationsStatic(); 
    }

    public static void viewAllDonationsStatic() {
        System.out.println("\n===== ALL DONATIONS =====");
        if (donations.isEmpty()) {
            System.out.println("No donations found.");
        } else {
            for (Donation d : donations) {
            	System.out.println(d.getId() + ": " + d.getFoodItem() + " (" + d.getQuantity() + ")");
            }
        }
    }
}
