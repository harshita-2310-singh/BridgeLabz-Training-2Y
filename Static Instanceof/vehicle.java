package keywords;

public class vehicle {
	    private static double registrationFee = 500.0;

	    private String ownerName;
	    private String vehicleType;
	    private final String registrationNumber;

	    public vehicle(String ownerName, String vehicleType, String registrationNumber) {
	        this.ownerName = ownerName;
	        this.vehicleType = vehicleType;
	        this.registrationNumber = registrationNumber;
	    }

	    public static void updateRegistrationFee(double newFee) {
	        registrationFee = newFee;
	        System.out.println("Registration fee updated to: $" + registrationFee);
	    }

	    public void displayRegistrationDetails() {
	        System.out.println("Owner Name: " + ownerName);
	        System.out.println("Vehicle Type: " + vehicleType);
	        System.out.println("Registration Number: " + registrationNumber);
	        System.out.println("Registration Fee: $" + registrationFee);
	    }

	    public void displayIfVehicle(Object obj) {
	        if (obj instanceof vehicle) {
	            ((vehicle) obj).displayRegistrationDetails();
	        } else {
	            System.out.println("Invalid Vehicle object.");
	        }
	    }
	}

	class VehicleRegistrationSystem {
	    public static void main(String[] args) {
	        vehicle v1 = new vehicle("Alice Johnson", "Car", "REG12345");
	        vehicle v2 = new vehicle("Bob Smith", "Motorcycle", "REG67890");

	        v1.displayIfVehicle(v1);
	        System.out.println();

	        v2.displayIfVehicle(v2);
	        System.out.println();

	        vehicle.updateRegistrationFee(600.0);
	        System.out.println();

	        v1.displayIfVehicle(v1);
	    }
	}
