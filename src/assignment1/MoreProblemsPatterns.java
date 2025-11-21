package assignment1;

public class MoreProblemsPatterns {

	public static void main(String[] args) {
//		for(int i=5;i>0;i--) {
//			for(int j=0;j<i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		System.out.println();
//		        int n = 5; // size of the square
//		        for (int i = 1; i <= n; i++) {
//		            for (int j = 1; j <= n; j++) {
//		                // print stars only on boundary
//		                if (i == 1 || i == n || j == 1 || j == n) {
//		                    System.out.print("*");
//		                } else {
//		                    System.out.print(" ");
//		                }
//		            }
//		            System.out.println();
//		        }

//		
//		  int n = 5;
//		  for (int i = n; i >= 1; i--) {
//	            for (int j = 1; j <= (2 * i - 1); j++) {
//	                System.out.print("*");
//	            }
//	            System.out.println();
//	        }
//		
//		  for(int i=1;i<=n;i++) {
//			  for(int j=1;j<=i;j++) {
//				  System.out.print(j);
//			  }
//			  System.out.println();
//		  }
//		  int n=5;
//		  int num =1;
//		  for(int i=1;i<=n;i++) {
//			  for(int j=1;j<=i;j++) {
//				  System.out.print(num+ " ");
//				  num++;
//			  }
//			  System.out.println();
//		  }

//		for (int i = 5;i>=1;i--) {
//			for (int j = 5; j>= i; j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				if ((i + j) % 2 == 0) {
//					System.out.print(1 + " ");
//				} else {
//					System.out.print(0 + " ");
//				}
//			}
//			System.out.println();
//		}
//		
//		int sq = 1;
//		for(int i=1;i<=5;i++) {
//			sq=i*i;
//			System.out.print(sq+ " ");
//		}

//		for(int i=5;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+ " ");
//			}
//			System.out.println();
//		}

//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(i*j+ " ");
//			}
//			System.out.println();
//		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i || i == 5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}
}
