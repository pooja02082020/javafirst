package assignment1;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
//		153 → 1³ + 5³ + 3³ = 153 (Armstrong Number)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check");
		int n = sc.nextInt();

		int original = n;
		int result = 0;

		while (n > 0) {
			int digit = n % 10;
			result = result + (digit * digit * digit);
			n = n / 10;
		}

		if (result == original) {
			System.out.println(original + " is an Armstrong number");
		} else {
			System.out.println(original + " is not an Armstrong number");
		}

		sc.close();

	}

}
