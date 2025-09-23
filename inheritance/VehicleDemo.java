interface Refuelable {
    void refuel();
}

class MyVehicle {
    String model;
    int maxSpeed;

    MyVehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends MyVehicle {
    int batteryCapacity;

    ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        System.out.println(model + " is charging with " + batteryCapacity + " kWh battery.");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

class PetrolVehicle extends MyVehicle implements Refuelable {
    double fuelTankCapacity;

    PetrolVehicle(String model, int maxSpeed, double fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling with " + fuelTankCapacity + " liters tank.");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 250, 75);
        PetrolVehicle pv = new PetrolVehicle("Toyota Corolla", 180, 50);

        System.out.println("Electric Vehicle:");
        ev.displayInfo();
        ev.charge();

        System.out.println("\nPetrol Vehicle:");
        pv.displayInfo();
        pv.refuel();
    }
}
