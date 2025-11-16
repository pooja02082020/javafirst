//import java.io.FileNotFoundException;
 
public class Test1 {
	  static double d1 =6.6;
	     static int x =(int)d1;
	 
     public static void main(String[] args) {
    	 System.out.println("HELLO");

         try {
             System.out.println(1);
         } catch (NullPointerException ex) {
             System.out.println("ONE");
//         } catch (FileNotFoundException ex) {
//             System.out.println("TWO");   Java doesn't allow to catch specific checked exceptions if these are not thrown by the statements inside try block.
         }
         System.out.println("THREE");
         
         
         int start = 1;
         int sum = 0;
         do {
             if(start % 2 == 0) {
                 continue;
             }
             sum += start;
         } while(++start <= 10);
         System.out.println(sum);
     }
}