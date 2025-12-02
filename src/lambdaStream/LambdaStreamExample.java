package lambdaStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaStreamExample {
	public static void main(String[] args) {

		// Thread Example
		Thread th = new Thread(() -> {
			for (int i = 0; i <= 5; i++)
				System.out.println("Running " + i);

		});
		th.start();

		// Comparator
		List<String> names = Arrays.asList("1Test", "3Test1", "2Test2");
		names.sort((a, b) -> a.compareTo(b)); // ascending order

		System.out.println(names);
		names.stream().map(String::toLowerCase).forEach(System.out::println);

		// Stream Filter - filter and forEach
		List<Integer> nums = Arrays.asList(10, 20, 43, 2, 7);
		nums.stream().filter(n -> n > 3).forEach(System.out::println); // method reference
		nums.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

		// Stream with map and reduce
		List<Integer> nums1 = Arrays.asList(0, 2, 3, 7);
		int sum = nums1.stream().map(n -> n * 2).reduce(0, (a, b) -> a + b); //multiple each item by 2 and sum 
		System.out.println("sum " + sum);
		
		int max = nums1.stream().max(Integer::compare).get();
		System.out.println("max number "+max);
		
		//with Predicate
		Predicate<String> check = s->s.startsWith("A");
		System.out.println(check.test("Apple"));
		System.out.println(check.test("Pear"));

	}
}
