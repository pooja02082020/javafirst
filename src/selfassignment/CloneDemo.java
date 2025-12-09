package selfassignment;

class Address implements Cloneable{
	int pin;
	
	public Address(int pin){this.pin=pin;}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
class Clone implements Cloneable{

	int id;
	Address add;
	
	public Object clone() throws CloneNotSupportedException {
		Clone c1 = (Clone) super.clone();
		add = (Address)add.clone();  //deep copy
		
		return c1;
	}
}


public class CloneDemo{
	public static void main(String[] args) {
		System.out.println();
	}
}