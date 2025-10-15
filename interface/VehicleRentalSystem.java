interface VehicleRental {
    void rent();
    void returnVehicle();
}

class Car implements VehicleRental {
    public void rent() {
        System.out.println("Car has been rented.");
    }

    public void returnVehicle() {
        System.out.println("Car has been returned.");
    }
}

class Bike implements VehicleRental {
    public void rent() {
        System.out.println("Bike has been rented.");
    }

    public void returnVehicle() {
        System.out.println("Bike has been returned.");
    }
}

class Bus implements VehicleRental {
    public void rent() {
        System.out.println("Bus has been rented.");
    }

    public void returnVehicle() {
        System.out.println("Bus has been returned.");
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        VehicleRental car = new Car();
        VehicleRental bike = new Bike();
        VehicleRental bus = new Bus();

        System.out.println("=== Renting Vehicles ===");
        car.rent();
        bike.rent();
        bus.rent();

        System.out.println("\n=== Returning Vehicles ===");
        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}
