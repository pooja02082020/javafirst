package assignment1;

public class Patterns1 {

	public static void main(String[] args) {
		//Print inverted traingle
//		*****
//		****
//		***
//		**
//		*
		
		for(int i=5;i>=1;i--) {
			//System.out.println( "i is "+i);
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
