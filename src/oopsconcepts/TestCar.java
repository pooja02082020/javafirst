package oopsconcepts;

public class TestCar {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.brandName = "Tata";
		c1.color = "Black";
		c1.speed = 200;
		
		c1.start();
		c1.run();
		
		
		Car c2 = new Car();
		c2.brandName = "BMW";
		c2.color = "white";
		c2.speed = 180;
		
		c2.start();
		c2.run();
	}
}
