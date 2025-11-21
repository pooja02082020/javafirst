package oopsconcepts;

 class Vehicle {
	
	void start() {
		System.out.println("Vehicle is starting");
	}
}

class Bike extends Vehicle{
	@Override
	void start() {
		System.out.println("Bike is running");
	}
}

public class TestOverrriding{
	public static void main(String[] args) {
		//Vehicle v1= new Vehicle();
		Vehicle v = new Bike();  //Method overridding -upcasting
		v.start();
		//v1.start();
	}
}

