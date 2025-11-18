package typecastingandcontrolstatements;

public class NestedLoops {
	public static void main(String[] args) {
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				System.out.print(j + " ");
			}
			System.out.println("i=" + i);
		}

		// Pattern 1
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Pattern 2
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i + 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		// Pattern 3
	    for (int i =1; i<=5; i++) {
	        for(int j=1; j<=5-i; j++) {
	            System.out.print(" ");
	        }
	        for (int k =1; k<=2*i-1; k++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }

	}
}
