package collections;

public class ComparatorClassDemo {

	int id;
	String name;
	int marks;

	public ComparatorClassDemo(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return id+" - "+name+"- " + marks;
		
	}
}
