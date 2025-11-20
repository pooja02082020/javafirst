package assignment1;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter nth number to generate prime numbers");
		int n = sc.nextInt();
		
		System.out.println("The prime numbers up to " + n + " are: ");
		
		for (int i = 2; i <= n; i++) {
		    int divisorFound = 0;

		    for (int j = 2; j < i; j++) {
		        if (i % j == 0) {
		            divisorFound = 1;
		            break;
		        }
		    }

		    if (divisorFound == 0) {
		        System.out.print(i + " ");
		    }
		}
		sc.close();
	}
}
