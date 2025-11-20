package assignment1;

import java.util.Scanner;

public class PrintNNumbers {

	public static void main(String[] args) {
		int num1 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth number N: ");
		int num2 = sc.nextInt();
	//	int result =0;
		for(int i =num1;i<=num2;i++) {
			System.out.print(i+ " ");
		}
		sc.close();
	}

}
