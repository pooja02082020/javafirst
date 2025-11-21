package oopsconceptscont;

class Counter {
	static int count = 0;

	Counter() {
		count++;
	}

	static void showCount() {
		System.out.println("Objects: " + count);
	}
}

public class TestStatic {
	public static void main(String[] args) {
		new Counter(); //calling constructor
		new Counter(); //calling constructor
		new Counter(); //calling constructor
		Counter.showCount();  ///objects -3
	}
}
