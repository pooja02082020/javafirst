
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
 
public class Test {
	
	
     public static void main(String[] args) {
         List<Character> list = new ArrayList<>();
         list.add(0, 'V');
         list.add('T');
         list.add(1, 'E');
         list.add(3, 'O');
 
         if(list.contains('O')) {
             list.remove(3);
         }
 
         for(char ch : list) {
             System.out.print(ch);
         }
         
         Integer i = 10;
         List<Integer> list1 = new ArrayList<>();
         list1.add(i);
         list1.add(new Integer(i));
         list1.add(i);
 
         list1.removeIf(j -> i == 10);
 
         System.out.println(list1);
         
         int a = 5;
         int x = 10;
         switch(x) {
             case 10:
                 a *= 2;
             case 20:
                 a *= 3;
             case 30:
                 a *= 4;
         }
         System.out.println(a);
         
         Period period = Period.of(0, 1000, 0);
         System.out.println(period);
         
         int y;
         for(y=0; y<=2; y++){}
         System.out.println(y);
         
         int p = 7;
         boolean res = p++ == 7 && ++p == 9 || p++ == 9;
         System.out.println("p = " + p);
         System.out.println("result = " + res);
         
         Error obj = new Error();
//         boolean flag1 = obj instanceof RuntimeException; //Line n1
//         boolean flag2 = obj instanceof Exception; //Line n2
         boolean flag3 = obj instanceof Error; //Line n3
         boolean flag4 = obj instanceof Throwable; //Line n4
         System.out.println(flag3 + ":" + flag4);
 
     }
}