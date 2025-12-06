package selfassignment;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        PracticeMenuApp obj = new PracticeMenuApp();
        Scanner sc = new Scanner(System.in);

        int choice;

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

            choice = sc.nextInt();

            switch (choice) {
                case 1: obj.printFibonacci(); break;
                case 2: obj.checkPrime(); break;
                case 3: obj.reverseString(); break;
                case 4: obj.checkPalindrome(); break;
                case 5: obj.findLargest(); break;
                case 6: obj.countVowelsConsonants(); break;
                case 7: obj.factorial(); break;
                case 8: obj.calculator(); break;
                case 9: System.out.println("Exiting... Thank you!"); break;
                default: System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 9);

        sc.close();
    }
}
