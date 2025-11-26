package collections;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<String> aq = new ArrayDeque<>();
		aq.offer("C");
		aq.offerFirst("A");
		aq.offerLast("B");
		System.out.println(aq);
		System.out.println(aq.peekFirst());
		System.out.println(aq.peekLast());

	}

}
