package oopsconceptscont;

public class StringExamples {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");

		String s4="Cat";
		String s5="Dog";
		String s6="hello";
		String s7 =s3.intern();
		System.out.println("After intern  " +(s7==s1));
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s5.compareTo(s4));
		System.out.println(s4.compareTo(s5));
		System.out.println(s1.compareTo(s3));
		
		System.out.println(s1.compareTo(s6));
		
		
		//methods
		System.out.println("The length of string is: "+ s1.length());
		System.out.println(s1.charAt(1));
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(2,4));
		System.out.println(s1.concat(s6));
		
		System.out.println(s1.replace("l", "p"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.repeat(2));
	
		System.out.println(s1.contains(s6));
		System.out.println(s1.indexOf("e"));
		System.out.println(s1.strip());  //removes whitespaces
	}

}
