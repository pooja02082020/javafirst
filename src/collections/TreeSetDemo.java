package collections;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(20);
		ts.add(90);
		ts.add(30);
		ts.add(90);
		System.out.println(ts); // [20,30,90] --sorted set

		HashSet<Integer> set = new HashSet<>(); // random order

		set.add(20);
		set.add(10);
		set.add(20); // duplicate ignored
		set.add(40);
		System.out.println(set);

		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(20);
		lhs.add(90);
		lhs.add(30);
		lhs.add(90);
		System.out.println(lhs); // not sorted [20, 90, 30]

		System.out.println("Hash Set");
		HashSet<String> hs = new HashSet<>();
		hs.add("Cat");
		hs.add("Dog");
		hs.add("Apple");
		System.out.println(hs);

		System.out.println("Linked Hash Set");
		LinkedHashSet<String> hset = new LinkedHashSet<>();
		hset.add("Cat");
		hset.add("Dog");
		hset.add("Apple");
		System.out.println(hset);

		System.out.println("Tree Set");
		TreeSet<String> tset = new TreeSet<>();
		tset.add("Cat");
		tset.add("Dog");
//			tset.add(null); --treeset cannot sort null
		tset.add("Apple");
		System.out.println(tset);

	}

}
