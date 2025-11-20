package oopsconcepts;

class Student {

    Student() {
        this("d");  // calls 1-arg constructor
        System.out.println("Default constructor");
    }

    Student(String name) {
        this("dssd", 18);   // calls 2-arg constructor
        System.out.println("1-Arg constructor: " + name);
    }

    Student(String name, int age) {
    	this(8,"g");
        System.out.println("2-Arg constructor: " + name + ", Age: " + age);
    }
    Student(int age, String name){
    	System.out.println("2-Arg constructor: " + age + ", Name: " + name);
    	
    }
}

public class ConstructorChainingThis {
    public static void main(String[] args) {
        new Student();
    }
}
