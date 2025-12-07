package oopsbasics;

interface Payment {
    void pay();
}

class CreditCard implements Payment {
    public void pay() {
        System.out.println("Paid using Credit Card");
    }
}

public class TestInterface {
    public static void main(String[] args) {
        Payment p = new CreditCard();
        p.pay();
    }
}
