package collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String>set = new HashSet<>();
		set.add("A");
		set.add(null);
		set.add(null);
		set.add("B");
		System.out.println(set);
	}
	
}
