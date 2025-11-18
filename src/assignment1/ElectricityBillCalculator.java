package assignment1;

public class ElectricityBillCalculator {

	public static void main(String[] args) {
		int unitsConsumption = 25;
		int bill;
		if (unitsConsumption > 0 && unitsConsumption <= 100) {
			bill = unitsConsumption * 5;
			System.out.println("The bill is " + bill);
		} else if (unitsConsumption > 100 && unitsConsumption <= 200) {
			bill = unitsConsumption * 7;
			System.out.println("The bill is " + bill);
		} else {
			bill = unitsConsumption * 10;
			System.out.println("The bill is " + bill);
		}

	}

}
