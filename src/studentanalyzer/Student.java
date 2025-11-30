package studentanalyzer;

public class Student {

 private String name;
 private int roll;
 private int[] marks = new int[3]; // m1, m2, m3

 private int total;
 private double percentage;
 private char grade;

 public Student(String name, int roll, int m1, int m2, int m3) {
     this.name = name.trim();
     this.roll = roll;
     this.marks[0] = m1;
     this.marks[1] = m2;
     this.marks[2] = m3;
 }

 public void computeStats() {
     total = marks[0] + marks[1] + marks[2];
     percentage = total / 3.0;

     if (percentage >= 90) grade = 'A';
     else if (percentage >= 80) grade = 'B';
     else if (percentage >= 70) grade = 'C';
     else if (percentage >= 60) grade = 'D';
     else grade = 'F';
 }

 public String getName() {
     return name;
 }

 public int getRoll() {
     return roll;
 }

 public int[] getMarks() {
     return marks;
 }

 public int getTotal() {
     return total;
 }

 public double getPercentage() {
     return percentage;
 }

 public char getGrade() {
     return grade;
 }
}
