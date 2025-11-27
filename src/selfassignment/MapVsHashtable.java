package selfassignment;

import java.util.*;

public class MapVsHashtable {
	public static void main(String[] args) {

		System.out.println("---- HASHMAP ----");
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Pooja");
		map.put(2, "Sanjay");
		map.put(null, "NullKey");
		map.put(3, null); // allowed
		/*
		 * 
		 * 
		 * compute hashcode of "Pooja"
		 * 
		 * get bucket index (ex: 9)
		 * 
		 * place Node(key="Pooja", value=90) into bucket[9]
		 * 
		 * put("Sanjay", 95) compute hashcode
		 * 
		 * bucket index (ex: 3)
		 * 
		 * place Node(key="Sanjay", value=95) into bucket[3]
		 */
		System.out.println("HashMap contents: " + map);

		System.out.println("\n---- HASHTABLE ----");
		Hashtable<Integer, String> table = new Hashtable<>();
		table.put(1, "Pooja");
		table.put(2, "Sanjay");

		try {
			table.put(null, "NullKey"); // error
		} catch (Exception e) {
			System.out.println("Hashtable null key error: " + e);
		}

		try {
			table.put(3, null); // error
		} catch (Exception e) {
			System.out.println("Hashtable null value error: " + e);
		}

		System.out.println("Hashtable contents: " + table);
	}
}
