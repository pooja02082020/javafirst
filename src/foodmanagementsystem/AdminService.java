package foodmanagementsystem;

import java.util.Scanner;

public class AdminService {

	Scanner sc = new Scanner(System.in);
	Admin admin = new Admin();
	 boolean isLoggedIn = false;
	public void adminLogIn() {
		do {
			System.out.println("Enter admin username: ");
			String user = sc.nextLine();
			
			System.out.println("Enter admin password: ");
			String pass = sc.nextLine();
			
			 if (user.equals(admin.username) && pass.equals(admin.password)) {
		            System.out.println("\nLogin successful!\n");
		            isLoggedIn = true;
		           // adminDashboard();
		        } else {
		            System.out.println("Invalid admin credentials!\n");
		        }
		}while(!isLoggedIn);
		
	}
			
}
