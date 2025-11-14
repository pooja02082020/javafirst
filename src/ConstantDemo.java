
public class ConstantDemo {
	public static final double TAX_RATE = 0.18; //Constant

	public static void main(String[] args) {
		double price = 5000;
		double tax = price * TAX_RATE;
		
		System.out.println("The price is "+price);
		System.out.println("The tax is "+tax);
		

	}

}
