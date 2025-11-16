import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class HelloWorld {
	
	static void change(int x) {
	    x = 10;
	    System.out.println("x "+ x);
	}

	
	

	public static void main(String[] args) {

		int a = 5;
		change(a);
		System.out.println(a);  // 5
		
		System.out.println("Hello Java!!");
		
		 int j;
   	  for( j=0; j<=2; j++){}
         
		System.out.println(j);
		
		
		 LocalDate date = LocalDate.of(2000, Month.JANUARY, 1);
         Period period = Period.parse("p-30000y");
         System.out.println(date.plus(period));
		
		
         StringBuilder sb = new StringBuilder("SpaceStation");
         sb.delete(5, 6).insert(5, " S").toString().toUpperCase();
         System.out.println(sb);
         
         System.out.println("Hello" + 1 + 2 + 3 + 4);
         
         System.out.println( 1 + 2 + 3 + 4+"Hello" );
	}

}
