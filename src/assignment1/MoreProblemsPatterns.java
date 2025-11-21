package assignment1;

import java.util.Scanner;

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

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				if (j == 1 || j == i || i == 5)
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}

//		 for (int i = 1; i <= 4; i++) {
//	            // left stars
//	            for (int j = 1; j <= i; j++) {
//	                System.out.print("*");
//	            }
//	            // spaces
//	            for (int j = 1; j <= 8 - 2 * i; j++) {
//	                System.out.print(" ");
//	            }
//	            // right stars
//	            for (int j = 1; j <= i; j++) {
//	                System.out.print("*");
//	            }
//	            System.out.println();
//	        }
//	        // lower part
//	        for (int i = 3; i >= 1; i--) {
//	            // left stars
//	            for (int j = 1; j <= i; j++) {
//	                System.out.print("*");
//	            }
//	            // spaces
//	            for (int j = 1; j <= 8 - 2 * i; j++) {
//	                System.out.print(" ");
//	            }
//	            // right stars
//	            for (int j = 1; j <= i; j++) {
//	                System.out.print("*");
//	            }
//	            System.out.println();
//	        }

//		Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number to check: ");
//        int num = sc.nextInt();
//
//        int original = num;
//        int reverse = 0;
//
//        while (num > 0) {
//            reverse = reverse * 10 + (num % 10);
//            num /= 10;
//        }
//
//        if (original == reverse)
//            System.out.println(original +" is a Palindrome");
//        else
//            System.out.println(original + " is not Palindrome");
//        sc.close();

//		for (int i = 1; i <= 3; i++) {
//			for (int j = 1; j <= 5; j++) {
//				if (j % 2 == 0)
//					System.out.print("#");
//				else
//					System.out.print("*");
//			}
//			System.out.println();
//		}

//		for (int i = 1; i <= 9; i++) {
//
//            if (i == 1 || i == 9) {
//                System.out.println("*");
//            } else {
//                for (int j = 1; j <= 3; j++) {
//                    if (j == 1 || j == 3) {
//                        System.out.print("*");
//                    } else {
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }
//        }

//		for (int i = 5; i >= 1; i--) {
//			for (int j = 1; j <= (2 * i - 1); j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		// Lower half
//		for (int i = 2; i <= 5; i++) {
//			for (int j = 1; j <= (2 * i - 1); j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		 char ch = 'A';   
//	        for (int i = 1; i <= 4; i++) {
//	            for (int j = 1; j <= i; j++) {
//	                System.out.print(ch);
//	            }
//	            System.out.println();
//	            ch++; 
//	        }
   
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size n to create checkboard pattern");
//		int n = sc.nextInt();
//	        for (int i = 1; i <= n; i++) {
//	            for (int j = 1; j <= n; j++) {
//	            	if((i+j)%2==0)
//	            		System.out.print(0);
//	            	else
//	            		System.out.print(1);
//	            }
//	            System.out.println();
//	        }
//	        sc.close();
		
//		Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number of rows: ");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                if (j == 1 || j == i) {  //border 1
//                    System.out.print("1 ");
//                } else {
//                    System.out.print("0 ");
//                }
//            }
//
//            System.out.println();
//        }
//        sc.close();
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the number to create: ");
	        int n = sc.nextInt();
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                if (j == 1 || j == i) {
	                    System.out.print("1 ");
	                } else {
	                    if (i % 2 == 0)
	                        System.out.print("1 ");
	                    else
	                        System.out.print("0 ");
	                }
	            }
	            System.out.println();
	        }
	        sc.close();

	}
}
