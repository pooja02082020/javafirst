package exceptionhandling;

public class TryCatchExample {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int result = a/b;   //Exception
			
			System.out.println("Result "+result);
			
		}catch(ArithmeticException ex) {
			System.out.println("Arthmetic Exception");
		}
		catch(Exception e) {
			System.out.println("Exception");
		}finally {
			System.out.println("Finally block");
		}
		

	}

}
