package firstday;

public class VariableDemo {

	int instanceVar = 100; //Instance Varable
	static int staticVar = 500; //Static Variable
	
	void display() {
		int localVar = 50; //Local Variable
		System.out.println("Local "+localVar);
		System.out.println("Instance "+instanceVar);
		System.out.println("Static  "+staticVar);
	}
	
	public static void main(String[] args) {
		VariableDemo obj = new VariableDemo();
		obj.display();
	}
}
