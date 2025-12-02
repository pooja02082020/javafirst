package lambdaStream;

@FunctionalInterface
interface Calculator{
	//user defined functional interface
	int add(int a, int b);
}

public class FunctionalInterfaceDemo {
public static void main(String[] args) {
	Calculator c = (x,y)->x+y;
	System.out.println(c.add(10, 30));
}
}
