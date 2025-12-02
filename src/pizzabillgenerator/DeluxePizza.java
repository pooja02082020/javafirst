package pizzabillgenerator;

public class DeluxePizza extends Pizza {

    public DeluxePizza(boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {
        System.out.println("Cheese already included in Deluxe Pizza");
    }

    @Override
    public void addExtraToppings() {
        System.out.println("Toppings already included in Deluxe Pizza");
    }
}
