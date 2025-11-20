package assignment1;

import java.util.Scanner;

public class MenuDrivenCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int choice = 0;
		int result = 0;
		do {

			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulus");
			System.out.println("6. Exit");

			System.out.println("Enter the choice:");
			choice = sc.nextInt();

			if (choice >= 1 && choice <= 5) {
				System.out.println("Enter the first number: ");
				int n1 = sc.nextInt();
				System.out.println("Enter the second number: ");
				int n2 = sc.nextInt();
				switch (choice) {
				case 1:
					result = n1 + n2;
					break;
				case 2:
					result = n1 - n2;
					break;
				case 3:
					result = n1 * n2;
					break;
				case 4:
					if (n2 != 0) {
						result = n1 / n2;

					} else {
						System.out.println("cannot be divisible by zero!");
						continue;
					}

					break;
				case 5:
					result = n1 % n2;
					break;
				}
				System.out.println("result= " + result);
			} else if (choice == 6) {
				System.out.println("Exiting...");
			} else {
				System.out.println("Invalid choice! Please try again");

			}

		} while (choice != 6);
		sc.close();
	}

}
