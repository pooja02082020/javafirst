package oopsbasics;

class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
