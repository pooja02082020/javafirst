package simpledbproject;

public class Student {
	private int id;
	private String name;
	private String email;
	private int marks;

	//paramaterized constructors
	public Student(String name, String email, int marks) {
		this.name = name;
		this.email = email;
		this.marks = marks;
	}

	public Student(int id, String name, String email, int marks) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.marks = marks;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getMarks() {
		return marks;
	}
}
