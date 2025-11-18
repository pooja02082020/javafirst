package assignment1;

import java.util.Scanner;

public class EnterPassword {

	public static void main(String[] args) {
	//	String password = "pooja";
		Scanner sc = new Scanner(System.in);
		String password ;
		do {
			System.out.println("Enter the password to enter");
			password= sc.next();
			
		}while(!password.equals("pooja"));
		
		System.out.println("Password Matched!! Please continue");
		sc.close();
	}
}
