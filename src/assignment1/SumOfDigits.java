package assignment1;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the initial digit to sum: ");
		int i=sc.nextInt();
		System.out.println("Enter the ending digit to sum: ");
		int n=sc.nextInt();
		int sum =0;
		
		while(i<=n) {
		   sum = sum+i;
			i++;
			
		}
		System.out.println("The sum of the digits is "+sum);
		
		sc.close();
		
	}


}
