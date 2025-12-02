package pizzabillgenerator;

public class Main {
    public static void main(String[] args) {

        System.out.println("------ Normal Pizza ------");
        Pizza p = new Pizza(true);
        p.addExtraCheese();
        p.addExtraToppings();
        p.takeAway();
        p.getBill();

        System.out.println("\n------ Deluxe Pizza ------");
        DeluxePizza dp = new DeluxePizza(false);
        dp.takeAway();
        dp.getBill();
    }
}
