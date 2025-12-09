package selfassignment;
class Paren {
	 void show() {
		System.out.println("PArent ");
	}
}

class Chil extends Paren {
	 void show() {
		System.out.println("Child");
	}
}

public class DynamicBindingDemo {
	public static void main(String[] args) {
		Paren p = new Chil();
		p.show();
		
		Paren p1 = new Paren();
		p1.show();
	}
}
