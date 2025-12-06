package selfassignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        PracticeMenuApp menuApp = new PracticeMenuApp();
        Scanner sc = new Scanner(System.in);

        int choice = 0;

        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Fibonacci");
            System.out.println("2. Check Prime");
            System.out.println("3. Reverse String");
            System.out.println("4. Palindrome Check");
            System.out.println("5. Largest in Array");
            System.out.println("6. Count Vowels & Consonants");
            System.out.println("7. Factorial");
            System.out.println("8. Calculator");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = sc.nextInt();

                switch (choice) {
                    case 1: menuApp.printFibonacci(); break;
                    case 2: menuApp.checkPrime(); break;
                    case 3: menuApp.reverseString(); break;
                    case 4: menuApp.checkPalindrome(); break;
                    case 5: menuApp.findLargest(); break;
                    case 6: menuApp.countVowelsConsonants(); break;
                    case 7: menuApp.factorial(); break;
                    case 8: menuApp.calculator(); break;
                    case 9: System.out.println("Exiting... Thank you!"); break;
                    default: System.out.println("Invalid choice! Try again.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid numeric choice.");
                sc.nextLine(); // clearing invalid input
            } catch (Exception e) {
                System.out.println("An unexpected error occurred in menu.");
            }

        } while (choice != 9);

        sc.close();
    }
}
