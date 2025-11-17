package oca;

public class BasicConcepts {

	public static void main(String[] args) {
		int i = 100;
		float f = 100.100f;
		double d = 123;
		
		//i=f; cannot assign float to integer
		f =i;
		//f=d;  cannot convert from double to float 
		//double 8 bytes float 4 bytes
	    d = f;   
	    d = i;
	  //  i = d ;  cannot convert from double to int
	    System.out.println(d);

	    
	    int x = 100;
	    int a =  x++;
	    int b = ++x;
	    int c = x++;
	    System.out.println("a= "+a +"   b= "+ b + "    c= "+c);
	    int dvalue = (a<b)?(a<c)?a:(b<c)?b:c:a;
	    System.out.println(dvalue);
	}

}
