package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorLogic implements Comparator<ComparatorClassDemo> {

	@Override
	public int compare(ComparatorClassDemo o1, ComparatorClassDemo o2) {
		return o1.name.compareTo(o2.name);
	}

}

class ComparatorLogicId implements Comparator<ComparatorClassDemo> {

	@Override
	public int compare(ComparatorClassDemo o1, ComparatorClassDemo o2) {
		return o1.id - o2.id;
	}

}

public class ComparatorExample {
	public static void main(String[] args) {
		List<ComparatorClassDemo> list = new ArrayList<>();
		list.add(new ComparatorClassDemo(1, "Pooja", 89));
		list.add(new ComparatorClassDemo(3, "Shradda", 80));
		list.add(new ComparatorClassDemo(2, "Sushma", 79));

		// System.out.println(list);
		System.out.println("Sorting by name");
		Collections.sort(list, new ComparatorLogic());
		list.forEach(System.out::println);

		System.out.println("Sorting by Id");
		Collections.sort(list, new ComparatorLogicId());
		list.forEach(System.out::println);

	}
}