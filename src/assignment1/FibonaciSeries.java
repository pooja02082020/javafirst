package assignment1;

import java.util.Scanner;

public class FibonaciSeries {

	public static void main(String[] args) {
		int sum = 0;
		int a = 0;
		int b = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth number to generate fibonacci series");
		int n = sc.nextInt();
		System.out.println("The fibonaci series up to " + n + " is: ");
		System.out.print("First 2 digits of fibacoo " + a + "\t" + b);
		for (int i = 0; i < n - 2; i++) {
			sum = a + b;
			
			a = b;
			b = sum;
			System.out.print("\t" + sum + "\t");

			
		}

		sc.close();
	}
}
