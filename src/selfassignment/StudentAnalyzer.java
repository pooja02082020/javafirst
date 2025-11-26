package selfassignment;

import java.util.Scanner;

public class StudentAnalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();  //next line 

        String[] names = new String[n];
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter marks of " + names[i] + ": ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }

        int highest = marks[0];
        int lowest = marks[0];
        int sum = 0;
        int passCount = 0;
        int failCount = 0;

        for (int i = 0; i < n; i++) {
            if (marks[i] > highest) highest = marks[i];
            if (marks[i] < lowest) lowest = marks[i];

            sum += marks[i];

            if (marks[i] >= 40) passCount++;
            else failCount++;
        }

        double average = (double) sum / n;
        
        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " - " + marks[i]);
        }

        System.out.println("\nHighest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
        System.out.println("Average Marks: " + average);
        System.out.println("Passed: " + passCount);
        System.out.println("Failed: " + failCount);

        sc.close();
    }
}
