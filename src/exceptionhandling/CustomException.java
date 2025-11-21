package exceptionhandling;

public class CustomException {
	static void validateAge(int age)throws AgeInvalidCustomException{
		if(age<18) {
			throw new AgeInvalidCustomException("Age must be greater than 18");
		}
		System.out.println("Valid Age");
	}

	public static void main(String[] args) {
		
		try {
			validateAge(15);
		}catch(Exception ex) {
			System.out.println("Exception "+ex.getMessage());
		}finally {
			System.out.println("exception finally");
		}
	}
	
}
