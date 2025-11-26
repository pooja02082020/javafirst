package collections;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<String, Integer> table = new Hashtable<>();
		table.put("a", 100);
		table.put("b", 200);
		// table.put(null, null); - no null values in hashtable
		System.out.println(table);
	}

}
