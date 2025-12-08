package simpledbproject;

import java.util.List;

public class StudentService {

	StudentDAO dao = new StudentDAO();

	public boolean isValidEmail(String email) {
		return email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
	}

	public void addStudent(String name, String email, int marks) {
		Student s = new Student(name, email, marks);

		boolean inserted = dao.insertStudent(s);

		if (inserted) {
			System.out.println("Student Added Successfully!");
		} else {
			System.out.println("Failed to Insert Student!");
		}
	}

	public void displayStudents() {
		List<Student> students = dao.getAllStudents();

		System.out.println("----- Student Records -----");
		for (Student s : students) {
			System.out.println(s.getId() + " | " + s.getName() + " | " + s.getEmail() + " | " + s.getMarks());
		}
	}
}
