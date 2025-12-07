package oopsbasics;

abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with push button");
    }
}

public class TestAbstraction {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
    }
}
