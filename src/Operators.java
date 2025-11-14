
public class Operators {

	public static void main(String[] args) {
		int a =10, b=20;
		
		System.out.println("addition :" + (a+b)) ;
		System.out.println("multiplication :" + (a*b)) ;
		
		//Relational
		System.out.println("a>b :" + (a>b)) ;
		System.out.println("a!b :" + (a!=b)) ;
		
		//Logical
		boolean isValid = (a>b)&&(b>5);
		System.out.println("isValid :" + isValid) ;
		
		boolean isVailid1 =(a>b)||(b>5);
		System.out.println("isvalid1 :" + isVailid1) ;
		
		boolean isVailid2 =!(b>5);
		System.out.println("isvalid2 :" + isVailid2) ;
		
		int x=5; //0101
		int y=3; //0011
		
		System.out.println("Bitwise AND: " +(x&y));
		System.out.println("Bitwise OR: " +(x|y));
		System.out.println(" XOR: " +(x^y));
		
		String result  = (x>y)?"X is greater" :"Y is greater";
		System.out.println(result);
	}

}
