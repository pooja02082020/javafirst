package assignment1;

public class MultiplicationTable {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println("---Table of--- " +i);
			for(int j = 1;j<=10;j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println();
		}

	}

}
