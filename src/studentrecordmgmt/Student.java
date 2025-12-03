package studentrecordmgmt;

import java.util.Arrays;

public class Student {

	private String name;
	private int roll;
	private String course;
	private int[] marks; // size 3

	public Student(String name, int roll, String course, int[] marks) {
		this.name = name.trim();
		this.roll = roll;
		this.course = course.trim();
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public int getRoll() {
		return roll;
	}

	public String getCourse() {
		return course;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setName(String name) {
		this.name = name.trim();
	}

	public void setCourse(String course) {
		this.course = course.trim();
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public void display() {
		System.out.println(
				"Roll: " + roll + ", Name: " + name + ", Course: " + course + ", Marks: " + Arrays.toString(marks));
	}
}
