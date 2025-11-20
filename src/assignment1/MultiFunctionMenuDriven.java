package assignment1;

import java.util.Scanner;

public class MultiFunctionMenuDriven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 0;

        do {

            System.out.println("\n1. Check Even/Odd");
            System.out.println("2. Find Factorial of a Number");
            System.out.println("3. Reverse a Number");
            System.out.println("4. Generate Fibonacci Series");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter a number: ");
                int n = sc.nextInt();

                switch (choice) {

                    // 1. Even/Odd
                    case 1:
                        if (n % 2 == 0)
                            System.out.println(n + " is Even");
                        else
                            System.out.println(n + " is Odd");
                        break;

                    // 2. Factorial
                    case 2:
                        int fact = 1;
                        for (int i = 1; i <= n; i++) {
                            fact = fact * i;
                        }
                        System.out.println("Factorial of " + n + " is " + fact);
                        break;

                    // 3. Reverse Number
                    case 3:
                        int rev = 0, temp = n;
                        while (temp != 0) {
                            int digit = temp % 10;
                            rev = rev * 10 + digit;
                            temp = temp / 10;
                        }
                        System.out.println("Reverse of " + n + " is " + rev);
                        break;

                    // 4. Fibonacci
                    case 4:
                        int a = 0, b = 1;
                        System.out.print("Fibonacci Series: ");
                        for (int i = 1; i <= n; i++) {
                            System.out.print(a + " ");
                            int next = a + b;
                            a = b;
                            b = next;
                        }
                        System.out.println();
                        break;
                }
            }

            // Exit option
            else if (choice == 5) {
                System.out.println("Exiting...");
            }

            else {
                System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);  

        sc.close();
    }
}
