package constructorslevel1;

public class CarRental {
	    String customerName;
	    String carModel;
	    int rentalDays;
	    double costPerDay;

	    CarRental() {
	        customerName = "Unknown";
	        carModel = "Standard";
	        rentalDays = 1;
	        costPerDay = 1000.0;
	    }

	    CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
	        this.customerName = customerName;
	        this.carModel = carModel;
	        this.rentalDays = rentalDays;
	        this.costPerDay = costPerDay;
	    }

	    CarRental(CarRental c) {
	        this.customerName = c.customerName;
	        this.carModel = c.carModel;
	        this.rentalDays = c.rentalDays;
	        this.costPerDay = c.costPerDay;
	    }

	    double calculateTotalCost() {
	        return rentalDays * costPerDay;
	    }

	    void display() {
	        System.out.println("Customer: " + customerName);
	        System.out.println("Car Model: " + carModel);
	        System.out.println("Rental Days: " + rentalDays);
	        System.out.println("Cost per Day: " + costPerDay);
	        System.out.println("Total Cost: " + calculateTotalCost());
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        CarRental r1 = new CarRental();
	        r1.display();

	        CarRental r2 = new CarRental("Alice", "Sedan", 5, 1500.0);
	        r2.display();

	        CarRental r3 = new CarRental(r2);
	        r3.display();
	    }
	}
