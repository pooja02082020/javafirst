package collections;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		 TreeMap<String,String> map = new TreeMap<>();
	 //      map.put(null,null);  --null vaue is not alloewd
	       map.put("A", null);
	       System.out.println(map);
	       map.put("D", "d");
	       System.out.println(map);
	       map.put("C", null);
	       System.out.println(map);
	       map.remove("D");
	       System.out.println(map);

	}

}
