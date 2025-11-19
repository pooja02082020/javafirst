package oopsconcepts;

//inheritance concepts
public class Animal {

	void eat() {
		System.out.println("Animal eats");
	}
}

	class Dog extends Animal {
		void barks() {
			System.out.println("Dog barks");
		}
}
