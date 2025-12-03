package studentrecordmgmt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {

    private List<Student> students = new ArrayList<>();
    private Scanner sc;

    public StudentManager(Scanner sc) {
        this.sc = sc;
    }

    public void addStudent() {
        System.out.println("\n--- Add Student ---");
        
        System.out.print("Name: ");
        String name = sc.nextLine().trim();
        if(name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }

        int roll;
        while(true) {
            System.out.print("Roll: ");
            roll = readInt();
            if(searchStudent(roll) != null) {
                System.out.println(" Roll number already exists. Enter different roll.");
            } else break;
        }

        System.out.print("Course: ");
        String course = sc.nextLine().trim();
        if(course.isEmpty()) {
            System.out.println("Course cannot be empty.");
            return;
        }

        int[] marks = new int[3];
        for (int i = 0; i < 3; i++) {
            marks[i] = readMarks("Marks for subject " + (i + 1) + ": ");
        }

        Student s = new Student(name, roll, course, marks);
        students.add(s);
        System.out.println(" Student added successfully.");
    }


    public void displayStudents() {
        System.out.println("\n--- Student List ---");
        if (students.isEmpty()) {
            System.out.println(" No students to display.");
            return;
        }

        for (Student s : students) {
            s.display();
        }
    }

    public Student searchStudent(int roll) {
        for (Student s : students) {
            if (s.getRoll() == roll) {
                return s;
            }
        }
        return null;
    }

    public void searchStudentMenu() {
        System.out.print("Enter roll to search: ");
        int roll = readInt();

        Student s = searchStudent(roll);
        if (s == null) {
            System.out.println("Student not found.");
        } else {
            System.out.println(" Student found:");
            s.display();
        }
    }


    public void updateStudent() {
        System.out.print("Enter roll to update: ");
        int roll = readInt();

        Student s = searchStudent(roll);
        if (s == null) {
            System.out.println(" Student not found.");
            return;
        }

        System.out.println("Current details:");
        s.display();

        System.out.print("New name (press Enter to skip): ");
        String name = sc.nextLine();
        if (!name.isBlank()) {
            s.setName(name);
        }

        System.out.print("New course (press Enter to skip): ");
        String course = sc.nextLine();
        if (!course.isBlank()) {
            s.setCourse(course);
        }

        System.out.print("Update marks? (y/n): ");
        String ans = sc.nextLine();
        if (ans.equalsIgnoreCase("y")) {
            int[] marks = new int[3];
            for (int i = 0; i < 3; i++) {
                marks[i] = readMarks("New marks for subject " + (i + 1) + ": ");
            }
            s.setMarks(marks);
        }

        System.out.println(" Student updated successfully.");
    }


    public void deleteStudent() {
        System.out.print("Enter roll to delete: ");
        int roll = readInt();

        Student s = searchStudent(roll);
        if (s == null) {
            System.out.println(" Student not found.");
            return;
        }

        students.remove(s);
        System.out.println(" Student deleted successfully.");
    }


    private int readInt() {
        while (true) {
            try {
                int value = Integer.parseInt(sc.nextLine());
                return value;
            } catch (NumberFormatException e) {
                System.out.print("Invalid number. Please re-enter: ");
            }
        }
    }

    private int readMarks(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                int value = Integer.parseInt(sc.nextLine());
                if(value < 0 || value > 100) {
                    System.out.println(" Marks must be between 0 and 100.");
                } else {
                    return value;
                }
            } catch (NumberFormatException e) {
                System.out.println(" Enter a valid integer for marks.");
            }
        }
    }
}
