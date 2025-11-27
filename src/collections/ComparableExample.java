package collections;

import java.util.*;

class Student implements Comparable<Student> {
    int roll;
    int marks;

    Student(int roll, int marks) {
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student s) {
        // Sort by marks in ascending order
        return this.marks - s.marks;
    }
}

public class ComparableExample {
    public static void main(String[] args) {

        Student s1 = new Student(101, 80);
        Student s2 = new Student(102, 70);
        Student s3 = new Student(103, 90);

        List<Student> list = Arrays.asList(s1, s2, s3);

        Collections.sort(list);   // uses compareTo()

        for (Student s : list) {
            System.out.println(s.roll + " -> " + s.marks);
        }
    }
}
