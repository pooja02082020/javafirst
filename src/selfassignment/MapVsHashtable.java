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
