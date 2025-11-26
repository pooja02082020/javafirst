package collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorsDemo {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();

		v.add(null);
		v.add("A");
		v.add("B");
		System.out.println(v);

		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			System.out.print(e.nextElement() + " ");

		}

	}
}
