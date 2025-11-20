package oopsconcepts;

interface Animal1 {
	void sound();
}

interface Animal2 {
	int x =10; //public static final
	default void run() {
		//we can only use default not public,protected and private is of no use
	}
	void eat();
}

class Dog1 implements Animal1,Animal2{
	@Override
	public void sound() {
		System.out.println("Dog Barks");
	}
	@Override
	public void eat() {
		System.out.println("Dog eats");
		
	}
	
	
}
public class InterfaceEx {
public static void main(String[] args) {
	Animal1 a = new Dog1();
	Animal2 b = new Dog1();
	a.sound();
	b.eat();
}
}
