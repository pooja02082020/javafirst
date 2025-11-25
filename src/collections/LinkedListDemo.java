package collections;

import java.util.*;


public class LinkedListDemo {
    public static void main(String[] args) {
    	
    	  LinkedList<String> list = new LinkedList<>();

          list.add(null);
          list.add(null);
          list.add("10");

          System.out.println(list);

          list.addFirst("10");

          System.out.println(list);

          list.addLast("10");

          System.out.println(list);
    }
}