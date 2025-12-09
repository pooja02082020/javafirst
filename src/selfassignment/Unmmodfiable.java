package selfassignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Unmmodfiable {

	public static void main(String[] args) {
		List<String>list = Arrays.asList("A","d");
		List<String>unmodifiable = Collections.unmodifiableList(list);
	//	unmodifiable.add("C"); //it will throw us java.lang.UnsupportedOperationException
	}
}
