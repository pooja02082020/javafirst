package collections;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) {
		 WeakHashMap<Object,String> map = new WeakHashMap<>();
		 Object key = new Object();
		 map.put(key, "Pooja");
		 
		 System.out.println("Before GC " +map);
		 
		 key = null;
		 
		 System.gc(); //running manually 
		 
		 try {
			 Thread.sleep(1000);
			 
		 }catch(Exception ex){
			 
		 } System.out.println("After GC " +map);

	}

}
