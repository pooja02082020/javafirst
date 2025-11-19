package oopsconcepts;

public class Calculator1 {

    // No parameter, No Return Type
    void welcome() {
        System.out.println("Welcome");
    }
    
    void welcome(String user) {
        System.out.println("Welcome"+ user);
    }
    
    void welcome(String user1, String user2) {
        System.out.println("Welcome"+ user1 +" and "+user2);
    }

    // With Parameter and No Return Type
    void greetUser(String user) {
        System.out.println("Welcome " + user);
    }

    // No Parameter and Return Type
    int add() {
        return 0;
    }

    // With Parameter and With Return Type
    int add(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
		Calculator1 c1 = new Calculator1();
		c1.welcome();
		c1.greetUser("Pooja");
		
		System.out.println(c1.add());
		
		int test1 = c1.add(10,20);
		
		c1.welcome("Pooja","Priya");
		//System.out.println("Test "+test);
		System.out.println("Test with parameter " + test1);
	}
}
