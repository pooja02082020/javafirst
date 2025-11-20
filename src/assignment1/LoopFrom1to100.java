package assignment1;

public class LoopFrom1to100 {

	public static void main(String[] args) {

		System.out.println("Numbers from 1 to 100");
		for (int i = 1; i <= 100; i++) {
			if (i == 50) {
				System.out.println();
			}
			System.out.print(i + " ");
		}

		// while loop to print even number from 1 to 50

		int evenCheck = 1;
		System.out.println("\n Even number from 1 to 50 are ");
		while (evenCheck <= 50) {
			if (evenCheck % 2 == 0) {
				System.out.print(evenCheck + " ");
			}
			evenCheck++;
		}

		// do while loop to print odd numbers from 1 to 100
		int oddCheck = 1;
		System.out.println("\n Odd numbers from 1 to 100 are: ");
		do {
			if (oddCheck % 2 != 0) {
				System.out.print(oddCheck + " ");
			}
			oddCheck++;
		} while (oddCheck <= 100);
	}
}
