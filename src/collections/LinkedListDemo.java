package collections;
import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(10);
        ll.add(20);
        ll.addFirst(5);
        ll.addLast(30);

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        
        System.out.println(ll.peekLast());
    }
}
