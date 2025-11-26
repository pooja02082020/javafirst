package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		  ArrayList<String> list = new ArrayList<>();

	        list.add("A");
	        list.add("B");
	        list.add("C");
	        list.add(1, "X");  // insert at index 1
	        list.add("D");

	        System.out.println(list);
	       
	        
	        Iterator<String>itr = list.iterator();
	        while(itr.hasNext()) {
	        	String element  = itr.next();
	        	System.out.println(element);
	        }
	}

}
