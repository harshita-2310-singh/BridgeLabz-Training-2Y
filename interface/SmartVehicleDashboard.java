public class SmartVehicleDashboard {

    interface VehicleDashboard {
        void displaySpeed(int speed);
    }

    interface BatteryStatus {
        void displayBattery(int percentage);
    }

    static class Car implements VehicleDashboard {
        public void displaySpeed(int speed) {
            System.out.println("Car Speed: " + speed + " km/h");
        }
    }

    static class ElectricCar implements VehicleDashboard, BatteryStatus {
        public void displaySpeed(int speed) {
            System.out.println("Electric Car Speed: " + speed + " km/h");
        }

        public void displayBattery(int percentage) {
            System.out.println("Battery Level: " + percentage + "%");
        }
    }

    public static void main(String[] args) {

        VehicleDashboard car = new Car();
        VehicleDashboard electricCar = new ElectricCar();
        BatteryStatus electricCarBattery = new ElectricCar();
        VehicleDashboard lambdaBike = speed -> System.out.println("Bike Speed: " + speed + " km/h");

        System.out.println("=== Vehicle Dashboards ===");
        car.displaySpeed(80);
        electricCar.displaySpeed(100);
        lambdaBike.displaySpeed(60);

        System.out.println("\n=== Electric Vehicle Battery ===");
        electricCarBattery.displayBattery(85);
    }
}
