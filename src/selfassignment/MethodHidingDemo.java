package selfassignment;

class Parent {
	static void show() {
		System.out.println("PArent ");
	}
}

class Child extends Parent {
	static void show() {
		System.out.println("Child");
	}
}

public class MethodHidingDemo {
	public static void main(String[] args) {
		Parent p = new Child();
		p.show();
	}
}
