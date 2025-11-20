package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }
}

public class MenuDrivenStudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n------ STUDENT MANAGEMENT SYSTEM ------");
            System.out.println("1. Add New Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Find Highest Marks Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                // 1. Add New Student
                case 1:
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();

                    sc.nextLine(); // Clear buffer
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    list.add(new Student(roll, name, marks));
                    System.out.println("Student Added Successfully!");
                    break;


                // 2. Display All Students
                case 2:
                    if (list.isEmpty()) {
                        System.out.println("No Records Found.");
                    } else {
                        System.out.println("\n---- Student Records ----");
                        for (Student s : list) {
                            s.display();
                        }
                    }
                    break;


                // 3. Search by Roll Number
                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    int searchRoll = sc.nextInt();

                    boolean found = false;
                    for (Student s : list) {
                        if (s.rollNo == searchRoll) {
                            System.out.println("Record Found:");
                            s.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Record Not Found!");
                    }
                    break;


                // 4. Highest Marks Student
                case 4:
                    if (list.isEmpty()) {
                        System.out.println("No Records Available.");
                    } else {
                        Student topStudent = list.get(0);
                        for (Student s : list) {
                            if (s.marks > topStudent.marks) {
                                topStudent = s;
                            }
                        }
                        System.out.println("Highest Scorer:");
                        topStudent.display();
                    }
                    break;


                // 5. Exit
                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
