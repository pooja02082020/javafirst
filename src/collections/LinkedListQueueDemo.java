package collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueDemo {

	public static void main(String[] args) {
		Queue<Integer>q= new LinkedList<>();
		q.offer(2);
		q.offer(25);
		
		System.out.println(q);
		
		q.remove();
		
		System.out.println(q);
	}

}
