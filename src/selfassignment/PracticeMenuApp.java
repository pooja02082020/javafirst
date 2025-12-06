package selfassignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticeMenuApp {

    Scanner sc = new Scanner(System.in);

    // 1. Fibonacci
    public void printFibonacci() {
        try {
            System.out.print("Enter number of terms: ");
            int n = sc.nextInt();

            int a = 0, b = 1;
            System.out.print(a + " " + b + " ");
            for (int i = 2; i < n; i++) {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter an integer.");
            sc.nextLine();
        }
    }

    // 2. Prime Check
    public void checkPrime() {
        try {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            boolean isPrime = true;

            if (num <= 1) isPrime = false;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) System.out.println(num + " is Prime");
            else System.out.println(num + " is NOT Prime");
        } catch (InputMismatchException e) {
            System.out.println("Invalid number input!");
            sc.nextLine();
        }
    }

    // 3. Reverse String
    public void reverseString() {
        try {
            System.out.print("Enter string: ");
            String str = sc.next();

            String reversed = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i);
            }
            System.out.println("Reversed: " + reversed);

        } catch (Exception e) {
            System.out.println("Unexpected error occurred.");
        }
    }

    // 4. Palindrome
    public void checkPalindrome() {
        try {
            System.out.print("Enter string: ");
            String str = sc.next();
            String reversed = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i);
            }

            if (str.equalsIgnoreCase(reversed))
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        } catch (Exception e) {
            System.out.println("Error comparing palindrome.");
        }
    }

    // 5. Largest in array
    public void findLargest() {
        try {
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();

            if (size <= 0) {
                System.out.println("Invalid array size!");
                return;
            }

            int[] arr = new int[size];
            System.out.println("Enter numbers: ");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            int max = arr[0];
            for (int num : arr) {
                if (num > max) max = num;
            }
            System.out.println("Largest number: " + max);

        } catch (InputMismatchException e) {
            System.out.println("Please enter valid integers for array values.");
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("Unexpected error in array input.");
        }
    }

    // 6. Count vowels & consonants
    public void countVowelsConsonants() {
        try {
            System.out.print("Enter string: ");
            String str = sc.next().toLowerCase();

            int v = 0, c = 0;
            for (char ch : str.toCharArray()) {
                if (ch >= 'a' && ch <= 'z') {
                    if ("aeiou".contains(ch + "")) v++;
                    else c++;
                }
            }
            System.out.println("Vowels: " + v + ", Consonants: " + c);
        } catch (Exception e) {
            System.out.println("Error processing string.");
        }
    }

    // 7. Factorial
    public void factorial() {
        try {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println("Factorial not defined for negative numbers!");
                return;
            }

            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("Factorial = " + fact);

        } catch (InputMismatchException e) {
            System.out.println("Invalid number!");
            sc.nextLine();
        }
    }

    // 8. Calculator
    public void calculator() {
        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter operator (+ - * /): ");
            char op = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result;

            switch (op) {
                case '+': result = a + b; break;
                case '-': result = a - b; break;
                case '*': result = a * b; break;
                case '/':
                    if (b == 0) {
                        System.out.println("Cannot divide by zero!");
                        return;
                    }
                    result = a / b;
                    break;
                default:
                    System.out.println("Invalid operator");
                    return;
            }

            System.out.println("Result: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Invalid numerical input!");
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("Unexpected calculator error.");
        }
    }
}
