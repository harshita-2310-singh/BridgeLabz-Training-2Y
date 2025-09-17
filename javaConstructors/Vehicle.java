package constructorslevel1;

public class Vehicle {
	    String ownerName;
	    String vehicleType;
	    static double registrationFee = 5000.0;

	    Vehicle(String ownerName, String vehicleType) {
	        this.ownerName = ownerName;
	        this.vehicleType = vehicleType;
	    }

	    void displayVehicleDetails() {
	        System.out.println("Owner: " + ownerName);
	        System.out.println("Vehicle Type: " + vehicleType);
	        System.out.println("Registration Fee: " + registrationFee);
	        System.out.println();
	    }

	    static void updateRegistrationFee(double newFee) {
	        registrationFee = newFee;
	    }

	    public static void main(String[] args) {
	        Vehicle v1 = new Vehicle("Rahul", "Car");
	        Vehicle v2 = new Vehicle("Sneha", "Bike");

	        v1.displayVehicleDetails();
	        v2.displayVehicleDetails();

	        Vehicle.updateRegistrationFee(7000.0);

	        v1.displayVehicleDetails();
	        v2.displayVehicleDetails();
	    }
	}
