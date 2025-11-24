package test;

public class Test {
public static void main(String[] args) {
		Car car = new Car();
		car.color = "black";
		car.brand = "Toyota";
		car.speed = 40;
		car.year = 2023;
		car.accelerate(1);
		System.out.println(car.speed);

	}
}
