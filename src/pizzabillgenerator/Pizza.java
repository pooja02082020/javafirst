package pizzabillgenerator;

public class Pizza {

    private int basePrice;
    private int price;
    private boolean veg;

    private final int extraCheesePrice = 100;
    private final int extraToppingsPrice = 200;
    private final int takeAwayPrice = 20;

    private boolean isCheeseAdded = false;
    private boolean isToppingsAdded = false;
    private boolean isTakeAway = false;

    public Pizza(boolean veg) {
        this.veg = veg;

        if (veg) {
            basePrice = 300;
        } else {
            basePrice = 400;
        }

        this.price = basePrice;
    }

    // Add cheese
    public void addExtraCheese() {
        if (!isCheeseAdded) {
            this.price += extraCheesePrice;
            isCheeseAdded = true;
        } else {
            System.out.println("Cheese already added!");
        }
    }

    // Add toppings
    public void addExtraToppings() {
        if (!isToppingsAdded) {
            this.price += extraToppingsPrice;
            isToppingsAdded = true;
        } else {
            System.out.println("Toppings already added!");
        }
    }

    // Takeaway
    public void takeAway() {
        if (!isTakeAway) {
            this.price += takeAwayPrice;
            isTakeAway = true;
        } else {
            System.out.println("TakeAway already added!");
        }
    }

    // FINAL BILL
    public void getBill() {
        System.out.println("\n-------- BILL SUMMARY --------");

        System.out.println("Base Price: " + basePrice);

        if (isCheeseAdded)
            System.out.println("Extra Cheese: " + extraCheesePrice);

        if (isToppingsAdded)
            System.out.println("Extra Toppings: " + extraToppingsPrice);

        if (isTakeAway)
            System.out.println("Take Away Charges: " + takeAwayPrice);

        System.out.println("------------------------------");
        System.out.println("TOTAL BILL: " + price);
        System.out.println("------------------------------");
    }
}
