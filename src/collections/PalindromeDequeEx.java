package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeDequeEx {

	public static void main(String[] args) {
		String s = "MADAM";
		boolean isPalindrome = true;

		Deque<Character> dq = new ArrayDeque<>();
		for (char c : s.toCharArray()) {
		    dq.offer(c);
		}

		while (dq.size() > 1) {
		    if (dq.pollFirst() != dq.pollLast()) {
		        isPalindrome = false;
		        break;
		    }
		}

		System.out.println(s + " is a Palindrome: " + isPalindrome);
	}
}
