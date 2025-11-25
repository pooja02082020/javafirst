package collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add(1, "X");  // insert at index 1

        System.out.println(list);
        System.out.println(list.get(2));
        list.set(2, "Z");  // update
        System.out.println(list);
        list.remove("X");  // remove by value
        System.out.println(list);

        System.out.println("Size = " + list.size());
    }
}
