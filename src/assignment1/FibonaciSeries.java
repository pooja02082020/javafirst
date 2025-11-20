package assignment1;

import java.util.Scanner;

public class FibonaciSeries {

	public static void main(String[] args) {
		int sum = 0;
		int a = 0;
		int b = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many terms you want in the Fibonacci series: ");
		int n = sc.nextInt();
		System.out.println("The Fibonacci series up to " + n + " terms is:");

		if (n >= 1)
			System.out.print(a);
		if (n >= 2)
			System.out.print(" " + b);

		for (int i = 3; i <= n; i++) {
			sum = a + b;
			System.out.print(" " + sum);
			a = b;
			b = sum;
		}

		sc.close();
	}
}