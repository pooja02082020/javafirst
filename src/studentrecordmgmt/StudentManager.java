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
     String name = sc.nextLine();

     System.out.print("Roll: ");
     int roll = readInt();

     System.out.print("Course: ");
     String course = sc.nextLine();

     int[] marks = new int[3];
     for (int i = 0; i < 3; i++) {
         System.out.print("Marks for subject " + (i + 1) + ": ");
         marks[i] = readInt();
     }

     Student s = new Student(name, roll, course, marks);
     students.add(s);
     System.out.println("Student added.");
 }

 public void displayStudents() {
     System.out.println("\n--- Student List ---");
     if (students.isEmpty()) {
         System.out.println("No students to display.");
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
         System.out.println("Student found:");
         s.display();
     }
 }

 public void updateStudent() {
     System.out.print("Enter roll to update: ");
     int roll = readInt();

     Student s = searchStudent(roll);
     if (s == null) {
         System.out.println("Student not found.");
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
             System.out.print("New marks for subject " + (i + 1) + ": ");
             marks[i] = readInt();
         }
         s.setMarks(marks);
     }

     System.out.println("Student updated.");
 }

 public void deleteStudent() {
     System.out.print("Enter roll to delete: ");
     int roll = readInt();

     Student s = searchStudent(roll);
     if (s == null) {
         System.out.println("Student not found.");
         return;
     }
     students.remove(s);
     System.out.println("Student deleted.");
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
}
