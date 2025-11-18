package assignment1;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		// square matrix pattern
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		// using break
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (n == 0) {
				System.out.println("Please enter different numbers ");
				break;
			} else {
				System.out.println("Print me");
			}
		}

		// For skipping three using continue
		System.out.println("The numbers except multiples of 3 are ");
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				continue;
			} else {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		/* 
		  
		*            
		**
		***
		****
		*****
		 
		  */

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		 * 1 121 12321 1234321
		 */

		for (int i = 1; i < 5; i++) {

			// spaces
			for (int j = 1; j < 5 - i; j++) {
				System.out.print(" ");
			}

			// increasing numbers
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}

			// decreasing numbers
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}

			System.out.println();
		}

		sc.close();
	}

}
