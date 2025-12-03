package studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();

		Student s = new Student();
		s.setName("Pooja");
		s.setEmail("pooja@gmail.com");
		s.setMarks(54);

		//dao.insertStudent(s);
	if (dao.insertStudent(s))
		System.out.println("Data inserted successfully!!");
	else
		System.out.println("Data failed");

		List<Student>list = dao.getAllStudents();
		list.forEach(System.out::println);
		
		
		Student updated = new Student();
		updated.setName("tt");
		updated.setEmail("tt@gmail.com");
		updated.setMarks(54);
		updated.setId(3);
		
		if(dao.updateStudent(updated))
			System.out.println("Data updated successfully!!");
		else
			System.out.println("Data cannot be updated!!");
		
		Student deleted = new Student();
		deleted.setId(2);
		if(dao.deleteStudent(deleted))
			System.out.println("Data deleted successfully!!");
		else
			System.out.println("Data failed");
		
	}
}
