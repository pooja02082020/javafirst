package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>();
		al1.add(null);
		al1.add("Test");
		al1.add(2,"test");
		al1.add(null);
		System.out.println(al1.get(3));
		
		al1.remove(0);
		System.out.println(al1);
	}

}
