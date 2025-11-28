package exceptionhandling;

public class BasicException {

	void checkAge(int age) {
		try {
			 if (age < 18)
				 throw new ArithmeticException("Not eligible");	
			 else
				 System.out.println("Eligible");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		 
		}

	public static void main(String[] args) {
		BasicException bexp = new BasicException();
		bexp.checkAge(12);
		
		int result = 0;
		try {
			result = 9 / 0;
		} catch (Exception e) {
			System.out.println("Divided by zero cannot be possible");
		} finally {
			System.out.println(result);
		}

		try {
			int a[] = new int[5];
			a[5] = 10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index error");
		} catch (Exception e) {
			System.out.println("General exception");
		}
		// System.out.println("No exception");

		try {
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println("Error");
		} finally {
			System.out.println("Always executes");
		}
		
		try {
			 try {
			 int a = 10 / 0;
			 } catch (ArithmeticException e) {
			 System.out.println("Inner handled");
			 }
			} catch (Exception e) {
			 System.out.println("Outer handled");

			}
		
		
	}

}
