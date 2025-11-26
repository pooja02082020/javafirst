package collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		  HashMap<Integer,String> map = new HashMap<>();
	       map.put(null,null);
	       map.put(1, null);
	       System.out.println(map);
	       map.put(3, "d");
	       System.out.println(map);
	       map.put(2, null);
	       System.out.println(map);
	       map.remove(3);
	       System.out.println(map);

	}

}
