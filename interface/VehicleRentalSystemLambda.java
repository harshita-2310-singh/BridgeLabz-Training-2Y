@FunctionalInterface
interface Rentable {
    void rent();
}

@FunctionalInterface
interface Returnable {
    void returnVehicle();
}

public class VehicleRentalSystemLambda {
    public static void main(String[] args) {
        Rentable carRent = () -> System.out.println("Car has been rented.");
        Returnable carReturn = () -> System.out.println("Car has been returned.");

        Rentable bikeRent = () -> System.out.println("Bike has been rented.");
        Returnable bikeReturn = () -> System.out.println("Bike has been returned.");

        Rentable busRent = () -> System.out.println("Bus has been rented.");
        Returnable busReturn = () -> System.out.println("Bus has been returned.");

        System.out.println("=== Renting Vehicles ===");
        carRent.rent();
        bikeRent.rent();
        busRent.rent();

        System.out.println("\n=== Returning Vehicles ===");
        carReturn.returnVehicle();
        bikeReturn.returnVehicle();
        busReturn.returnVehicle();
    }
}
