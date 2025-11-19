package oopsconcepts;

public class ConstructorExample {

	ConstructorExample() {
		System.out.println("constructors ");
	}

	ConstructorExample(String s) {
		System.out.println("With argument constructor"+s);
	}
	
	ConstructorExample(int a, int b) {
		System.out.println("With argument constructor "+(a+b));
	}
	
	public static void main(String[] args) {
		ConstructorExample cl = new ConstructorExample(" class");
		
		ConstructorExample c2 = new ConstructorExample(10,20);
	}
}
