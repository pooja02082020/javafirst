package foodmanagementsystem;

public class Donation {

	private int id;
	private String foodItem;
	private int quantity;

	public Donation(int id, String foodItem, int quantity) {
		this.id = id;
		this.foodItem = foodItem;
		this.quantity = quantity;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFoodItem() {
		return this.foodItem;
	}

	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
