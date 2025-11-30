package studentanalyzer;

import java.util.Scanner;

public class StudentAnalyzer {

 private static Scanner sc = new Scanner(System.in);

 public static void main(String[] args) {

     System.out.print("Enter number of students: ");
     int n = readInt();

     Student[] students = new Student[n];

     readStudents(students);
     computeStats(students);

     menu(students);

     sc.close();
 }

 // Read students with validation
 private static void readStudents(Student[] students) {
     for (int i = 0; i < students.length; i++) {
         System.out.println("\n--- Enter details for Student " + (i + 1) + " ---");

         System.out.print("Name: ");
         String name = sc.nextLine().trim();

         System.out.print("Roll number: ");
         int roll = readInt();

         int m1 = readMarks("Marks for Subject 1: ");
         int m2 = readMarks("Marks for Subject 2: ");
         int m3 = readMarks("Marks for Subject 3: ");

         students[i] = new Student(name, roll, m1, m2, m3);
     }
 }

 private static int readInt() {
     while (true) {
         try {
             int value = Integer.parseInt(sc.nextLine());
             return value;
         } catch (NumberFormatException e) {
             System.out.print("Invalid number. Please enter again: ");
         }
     }
 }

 private static int readMarks(String message) {
     while (true) {
         System.out.print(message);
         try {
             int marks = Integer.parseInt(sc.nextLine());
             if (marks < 0 || marks > 100) {
                 System.out.println("Marks must be between 0 and 100.");
             } else {
                 return marks;
             }
         } catch (NumberFormatException e) {
             System.out.println("Please enter a valid integer for marks.");
         }
     }
 }

 // Compute totals & grades
 private static void computeStats(Student[] students) {
     for (Student s : students) {
         s.computeStats();
     }
 }

 // Menu
 private static void menu(Student[] students) {
     int choice;
     do {
         System.out.println("\n====== STUDENT ANALYZER MENU ======");
         System.out.println("1. Print full report");
         System.out.println("2. Show topper & lowest scorer");
         System.out.println("3. Show subject toppers");
         System.out.println("4. Search by name");
         System.out.println("5. Exit");
         System.out.print("Enter your choice: ");

         choice = readInt();

         switch (choice) {
             case 1:
                 printReport(students);
                 break;
             case 2:
                 showTopperAndLowest(students);
                 break;
             case 3:
                 showSubjectToppers(students);
                 break;
             case 4:
                 searchByNameMenu(students);
                 break;
             case 5:
                 System.out.println("Exiting... Bye!");
                 break;
             default:
                 System.out.println("Invalid choice. Try again.");
         }
     } while (choice != 5);
 }

 // Print formatted report
 private static void printReport(Student[] students) {
     System.out.println("\n---------------- STUDENT REPORT ----------------");
     System.out.printf("%-5s %-15s %-5s %-5s %-5s %-7s %-10s %-5s%n",
             "Roll", "Name", "M1", "M2", "M3", "Total", "Percent", "Grade");
     System.out.println("-------------------------------------------------------------");

     for (Student s : students) {
         int[] m = s.getMarks();
         System.out.printf("%-5d %-15s %-5d %-5d %-5d %-7d %-10.2f %-5c%n",
                 s.getRoll(), s.getName(), m[0], m[1], m[2],
                 s.getTotal(), s.getPercentage(), s.getGrade());
     }
 }

 // Topper, lowest
 private static void showTopperAndLowest(Student[] students) {
     Student topper = findTopper(students);
     Student lowest = findLowest(students);

     System.out.println("\nTopper:");
     printSingleStudent(topper);

     System.out.println("\nLowest Scorer:");
     printSingleStudent(lowest);
 }

 private static Student findTopper(Student[] students) {
     Student topper = students[0];
     for (Student s : students) {
         if (s.getTotal() > topper.getTotal()) {
             topper = s;
         }
     }
     return topper;
 }

 private static Student findLowest(Student[] students) {
     Student lowest = students[0];
     for (Student s : students) {
         if (s.getTotal() < lowest.getTotal()) {
             lowest = s;
         }
     }
     return lowest;
 }

 private static void printSingleStudent(Student s) {
     int[] m = s.getMarks();
     System.out.printf("Roll: %d, Name: %s, Marks: [%d, %d, %d], Total: %d, %%: %.2f, Grade: %c%n",
             s.getRoll(), s.getName(), m[0], m[1], m[2],
             s.getTotal(), s.getPercentage(), s.getGrade());
 }

 // Subject toppers
 private static void showSubjectToppers(Student[] students) {
     for (int subjectIndex = 0; subjectIndex < 3; subjectIndex++) {
         Student topper = subjectTopper(students, subjectIndex);
         System.out.println("Subject " + (subjectIndex + 1) + " Topper: " +
                 topper.getName() + " (" + topper.getMarks()[subjectIndex] + " marks)");
     }
 }

 private static Student subjectTopper(Student[] students, int subjectIndex) {
     Student topper = students[0];
     for (Student s : students) {
         if (s.getMarks()[subjectIndex] > topper.getMarks()[subjectIndex]) {
             topper = s;
         }
     }
     return topper;
 }

 // Search by name 
 private static void searchByNameMenu(Student[] students) {
     System.out.print("Enter name to search : ");
     String query = sc.nextLine().toLowerCase();

     boolean found = false;
     for (Student s : students) {
         if (s.getName().toLowerCase().contains(query)) {
             if (!found) {
                 System.out.println("\nSearch Results:");
             }
             printSingleStudent(s);
             found = true;
         }
     }

     if (!found) {
         System.out.println("No student found with that name.");
     }
 }
}
