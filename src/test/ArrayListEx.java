package test;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(new Boolean("tRue"));
        list.add(new Boolean("abc"));

        if(list.remove(1)) {
            list.remove(1);
        }

        System.out.println(list);
        
		  LocalDate obj = LocalDate.of(2020, 2, 14);
          System.out.println(obj.minus(Period.ofDays(10)));
          
          LocalDate joiningDate = LocalDate.parse("2006-03-16");
          System.out.println(joiningDate.withMonth(5));
       
           boolean flag = false;
          while(flag) {
              System.out.println("Good Morning!");
            
        }
	
          System.out.println("Hello");;;;;;;;;
//          
//          List<String> list = new ArrayList<>();
//          list.add(0, "Array");
//          list.set(0, "List");
//  
//          System.out.println(list);
	}
	
	

}
