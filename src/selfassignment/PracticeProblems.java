package selfassignment;

public class PracticeProblems {

	// 1. Fibonacci
	public void printFibonacci(int n) {
		int a = 0, b = 1;
		System.out.print(a + " " + b + " ");
		for (int i = 2; i < n; i++) {
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
		System.out.println();
	}

	// 2. Check Prime
	public void checkPrime(int num) {
		boolean isPrime = true;
		if (num <= 1)
			isPrime = false;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime)
			System.out.println(num + " is Prime");
		else
			System.out.println(num + " is NOT Prime");
	}

	// 3. Reverse String
	public void reverseString(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		System.out.println("Reversed: " + reversed);
	}

	// 4. Palindrome Check
	public void checkPalindrome(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}

		if (str.equalsIgnoreCase(reversed))
			System.out.println(str + " is Palindrome");
		else
			System.out.println(str + " is NOT Palindrome");
	}

	// 5. Find Largest in Array
	public void findLargest(int[] arr) {
		int max = arr[0];
		for (int num : arr) {
			if (num > max)
				max = num;
		}
		System.out.println("Largest: " + max);
	}

	// 6. Count vowels & consonants
	public void countVowelsConsonants(String str) {
		int v = 0, c = 0;

		str = str.toLowerCase();
		for (char ch : str.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				if ("aeiou".contains(ch + ""))
					v++;
				else
					c++;
			}
		}

		System.out.println("Vowels: " + v + ", Consonants: " + c);
	}

	// 7. Factorial
	public void factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		System.out.println("Factorial: " + fact);
	}

	// 8. Calculator
	public void calculator(int a, int b, char op) {
		int result;
		switch (op) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = b != 0 ? a / b : 0;
			break;
		default:
			System.out.println("Invalid Operator!");
			return;
		}
		System.out.println("Result: " + result);
	}

	public static void main(String[] args) {

		PracticeProblems obj = new PracticeProblems();

		obj.printFibonacci(10);
		obj.checkPrime(11);
		obj.reverseString("Pooja");
		obj.checkPalindrome("madam");
		obj.findLargest(new int[] { 3, 9, 1, 6 });
		obj.countVowelsConsonants("Canada");
		obj.factorial(5);
		obj.calculator(10, 5, '+');
	}
}
