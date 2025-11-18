package typecastingandcontrolstatements;

public class ControlStatements {
	public static void main(String[] args) {
		// if statement
		int age = 20;
		if (age > 18) {
			System.out.println("Eligible to vote");
		}
		// if-else
		int num = 43;
		if (num % 2 == 0) {
			System.out.println(num + " is an even number");
		} else {
			System.out.println(num + " is an odd number");
		}

		// else-if ladder /nested else-if
		int marks = 77;
		if (marks > 90) {
			System.out.println("Distinction");
		} else if (marks > 75) {
			System.out.println("First Division");
		} else if (marks > 65) {
			System.out.println("Second Division");
		} else {
			System.out.println("Better luck next time");
		}

		// switch
		int day = 4;

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thrusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		default:
			System.out.println("Weekends");

		}
		
		//for loop
		
		for(int i=1;i<=5;i++) {
			System.out.print("\t" +i);
		}
		
		for(int i=5;i>=1;i--) {
			System.out.println("\t" +i);
		}
		
		// infinite loop for(;;) {}
		
		//while loop
		int i=1;
		System.out.println("while loop");
		while(i<=5) {
			System.out.println("i= "+i);
			//System.out.println(i++);
			++i;
		}
		
		//do-while loop
		int j=1;
		System.out.println("Do while loop");
		do {
			System.out.println(j);
			++j;
		}while(j<1);
	}
}
