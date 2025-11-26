package collections;

import java.util.ArrayList;

import java.util.ListIterator;

public class ListIteratorsDemo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add(1, "X"); // insert at index 1
		list.add("D");

		System.out.println(list);

		ListIterator<String> itr = list.listIterator();
		while (itr.hasNext()) {
			String element = itr.next();
			if(element.equals("B")) {
				itr.add("E");
			}
			System.out.print(element + " ");
		}

		System.out.println();
		while (itr.hasPrevious()) {
			String element = itr.previous();
			System.out.print(element+ " ");

		}
			System.out.println();
	}

}
