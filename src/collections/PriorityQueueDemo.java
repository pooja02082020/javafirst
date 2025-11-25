package collections;

import java.util.*;
public class PriorityQueueDemo {
	 public static void main(String args[]) {

	        PriorityQueue<Integer> p = new PriorityQueue<>();

	        p.add(50);
	        p.add(30);
	        p.add(10);
	        p.add(60);

	        System.out.println(p);

	        p.poll();   // removes the head (smallest element)

	        System.out.println(p);

	        System.out.println(p.peek()); // shows head (smallest element)
	        
	        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

	        q.add(50);
	        q.add(30);
	        q.add(10);
	        q.add(60);

	        System.out.println(q);

	        q.poll();

	        System.out.println(q);
	        System.out.println(q.peek());
	    }
	}