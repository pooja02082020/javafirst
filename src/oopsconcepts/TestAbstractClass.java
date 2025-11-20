package oopsconcepts;



abstract  class Vehicle1 {

	abstract void start();
	
	void run() {
		System.out.println("Runing");
	}
}


class Car1 extends Vehicle1{
	@Override
	void start() {
		System.out.println("Starting");
	}
}

public class TestAbstractClass{
	public static void main(String[] args) {
	Car1  c= new Car1();	
	//Vechile1 v = new Vehicle(); --abstract claass cannot be initializes
	Vehicle1 v = new Car1();
	v.start();
	}
}