package collections;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
		String a1 = new String("Pooja");
		String a2 = new String("Pooja");

		map.put(a1, 10);
		map.put(a2, 20);
		System.out.println();
	}

}
