package test;

abstract class Animal {
    // concrete method
    void sleep() {
        System.out.println("Animal is sleeping");
    }

    // abstract method (no body)
    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sleep();   // from Animal
        d.sound();   // overridden in Dog
    }
}
