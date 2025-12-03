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

            int roll;
            while (true) {
                System.out.print("Roll number: ");
                roll = readInt();

                if (!isRollExists(students, roll, i)) break;
                System.out.println("❗ Roll number already exists. Enter a different one.");
            }

            int m1 = readMarks("Marks for Subject 1: ");
            int m2 = readMarks("Marks for Subject 2: ");
            int m3 = readMarks("Marks for Subject 3: ");

            students[i] = new Student(name, roll, m1, m2, m3);
        }
    }

    // Check duplicate rolls
    private static boolean isRollExists(Student[] students, int roll, int index) {
        for (int i = 0; i < index; i++) {
            if (students[i].getRoll() == roll) {
                return true;
            }
        }
        return false;
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
                case 1 -> printReport(students);
                case 2 -> showTopperAndLowest(students);
                case 3 -> showSubjectToppers(students);
                case 4 -> searchByNameMenu(students);
                case 5 -> System.out.println("Exiting... Bye!");
                default -> System.out.println("Invalid choice. Try again.");
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
        int maxTotal = findHighestTotal(students);
        int minTotal = findLowestTotal(students);

        System.out.println("\nTopper(s):");
        for (Student s : students) {
            if (s.getTotal() == maxTotal) {
                printSingleStudent(s);
            }
        }

        System.out.println("\nLowest Scorer(s):");
        for (Student s : students) {
            if (s.getTotal() == minTotal) {
                printSingleStudent(s);
            }
        }
    }

    private static int findHighestTotal(Student[] students) {
        int max = students[0].getTotal();
        for (Student s : students) {
            if (s.getTotal() > max) {
                max = s.getTotal();
            }
        }
        return max;
    }

    private static int findLowestTotal(Student[] students) {
        int min = students[0].getTotal();
        for (Student s : students) {
            if (s.getTotal() < min) {
                min = s.getTotal();
            }
        }
        return min;
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

            int maxMarks = subjectTopperMarks(students, subjectIndex);

            System.out.print("Subject " + (subjectIndex + 1) + " Topper(s): ");

            for (Student s : students) {
                if (s.getMarks()[subjectIndex] == maxMarks) {
                    System.out.print(s.getName() + " ");
                }
            }

            System.out.println("(" + maxMarks + " marks)");
        }
    }

    private static int subjectTopperMarks(Student[] students, int subjectIndex) {
        int max = students[0].getMarks()[subjectIndex];
        for (Student s : students) {
            if (s.getMarks()[subjectIndex] > max) {
                max = s.getMarks()[subjectIndex];
            }
        }
        return max;
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
