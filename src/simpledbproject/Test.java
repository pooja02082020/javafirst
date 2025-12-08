package simpledbproject;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();
        
        while(true) {
            System.out.println("\n===== Student Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            
            int choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.print("Enter name: ");
                    sc.nextLine();  // flush
                    String name = sc.nextLine();
                    
                    String email;
                    while(true) {
                        System.out.print("Enter email: ");
                        email = sc.nextLine();

                        if(service.isValidEmail(email)) {
                            break;
                        } else {
                            System.out.println("Invalid email! Please try again.");
                        }
                    }

                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();
                    
                    service.addStudent(name, email, marks);
                    break;

                case 2:
                    service.displayStudents();
                    break;

                case 3:
                    System.out.println("Exiting from the system!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            } 
        }
       
    }
}
