package studentrecordmgmt;

import java.util.Scanner;

public class StudentRecordApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentManager manager = new StudentManager(sc);

		int choice;
		do {
			System.out.println("\n===== STUDENT RECORD MANAGEMENT =====");
			System.out.println("1. Add Student");
			System.out.println("2. Display Students");
			System.out.println("3. Search Student");
			System.out.println("4. Update Student");
			System.out.println("5. Delete Student");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");

			choice = readInt(sc);

			switch (choice) {
			case 1 -> manager.addStudent();
			case 2 -> manager.displayStudents();
			case 3 -> manager.searchStudentMenu();
			case 4 -> manager.updateStudent();
			case 5 -> manager.deleteStudent();
			case 6 -> System.out.println("Exiting...");
			default -> System.out.println("Invalid choice.");
			}

		} while (choice != 6);

		sc.close();
	}

	private static int readInt(Scanner sc) {
		while (true) {
			try {
				int value = Integer.parseInt(sc.nextLine());
				return value;
			} catch (NumberFormatException e) {
				System.out.print("Invalid number. Please re-enter: ");
			}
		}
	}
}
