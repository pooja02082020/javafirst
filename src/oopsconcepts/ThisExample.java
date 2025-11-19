package oopsconcepts;

public class ThisExample {

	int x;
	
	ThisExample(int x){
		this.x = x; //this is used to refer the instance variable
		System.out.println(x);
	}
	
	void start() {
		System.out.println("Values = "+this.x);
	}
	
	public static void main(String[] args) {
		ThisExample t1 = new ThisExample(80);
		t1.start();
		
		ThisExample t2 = new ThisExample(60);
		t2.start();
		
	}
}
