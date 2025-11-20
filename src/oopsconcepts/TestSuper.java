package oopsconcepts;

class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 20;

	void show() {
		System.out.println("accessing from child's class to parent class" +super.x);
		System.out.println("accessing from parent's class" +x);

	}
}

public class TestSuper {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.show();
	}
}
