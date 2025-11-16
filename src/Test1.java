//import java.io.FileNotFoundException;
 
public class Test1 {
     public static void main(String[] args) {
         try {
             System.out.println(1);
         } catch (NullPointerException ex) {
             System.out.println("ONE");
//         } catch (FileNotFoundException ex) {
//             System.out.println("TWO");   Java doesn't allow to catch specific checked exceptions if these are not thrown by the statements inside try block.
         }
         System.out.println("THREE");
     }
}