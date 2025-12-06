package selfassignment;

import java.util.Scanner;

public class PracticeMenuApp {

    Scanner sc = new Scanner(System.in);

    public void printFibonacci() {
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
    }

    public void checkPrime() {
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
    }

    public void reverseString() {
        System.out.print("Enter string: ");
        String str = sc.next();
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed: " + reversed);
    }

    public void checkPalindrome() {
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
    }

    public void findLargest() {
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

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
    }

    public void countVowelsConsonants() {
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
    }

    public void factorial() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial = " + fact);
    }

    public void calculator() {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter operator (+ - * /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = 0;

        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = b != 0 ? a / b : 0; break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
    }
}
