package selfassignment;

import java.util.Arrays;

public class AnagramEx {

	public static void main(String[] args) {
		String s1 = "Silent";
		String s2 = "Listen";
		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		if (Arrays.equals(a1, a2))
			System.out.println("Anagram");
	}
}
