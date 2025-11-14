

public class New {
  public static void main(String[] args) {
	if(args.length<3) {
		System.out.println("Usage: java DisplayDetails <Name><Age><City>");
		return;
	}
	
	String name = args[0];
	int age = Integer.parseInt(args[1]);
	String city = args[2];
	System.out.println("---Personal Details---");
	System.out.println("Name: "+name);
	System.out.println("Age "+age);
	System.out.println("City "+city);
}
}
