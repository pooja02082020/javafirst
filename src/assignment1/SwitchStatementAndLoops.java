package assignment1;

import java.util.Scanner;

public class SwitchStatementAndLoops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int a = sc.nextInt();

		System.out.print("Enter Second Number: ");
		int b = sc.nextInt();

		System.out.print("Enter Operand: ");
		String operator = sc.next();

		int result = 0;
		// using switch
		switch (operator) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "*":
			result = a * b;
			break;
		case "/":
			if (b != 0) {
				result = a / b;
			} else {
				System.out.println("Cannot be divisible by 0");
			}
			break;
		default:
			System.out.println("Invalid operator");
			break;
		}

		System.out.println("The result using switch is " + result);

		// Using for loop

		for (int i = 1; i < 2; i++) {
			System.out.println("The result using for loop is: " + result);
		}

		// Using while loop
		int i = 1;
		while (i < 2) {
			System.out.println("The result using while loop is: " + result);
			i++;
		}

		int j = 1;
		do {
			System.out.println("The result using do-while loop is: " + result);
			j++;
		} while (j < 2);

		sc.close();
	}

}
