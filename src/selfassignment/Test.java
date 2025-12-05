package selfassignment;

import java.util.Arrays;

class Point {
    int x; 
    int y;
    
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 100;
        p1.y = 200;

        Point p2 = new Point();
        p2.x = 300;
        p2.y = 400;

        System.out.println(p1);
        System.out.println(p2);
        
      String s1 = "icecream";
      String s2 = "cinema";
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(Arrays.equals(a1,a2))
        	System.out.println("Anagram");
        else{
        	System.out.println("not");
        }
    }
}
