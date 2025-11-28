package selfassignment;

public class ThrowThrowsExample {

	// Method MAY throw exception -> insufficient balance scenario
	static void withdraw(int balance, int amount) throws Exception {
		if (amount > balance) {
			throw new Exception("Withdrawal failed: Insufficient balance!");
		}
		System.out.println("Withdrawal successful: " + amount);
	}

	public static void main(String[] args) {

		int balance = 5000; // user's account balance

		try {
			withdraw(balance, 7000); // method declared with throws
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
		} finally {
			System.out.println("finally executed");
		}

		// Manual throw example
		try {
			int pin = 1111;
			if (pin != 1234) {
				throw new RuntimeException("ATM blocked: Wrong PIN entered!");
			}
		} catch (RuntimeException ex) {
			System.out.println(ex.getMessage());
		}

	}
}
