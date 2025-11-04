import java.time.LocalDate;

class ServiceOverdueException extends Exception {
    public ServiceOverdueException(String message) {
        super(message);
    }
}

class InvalidMileageException extends Exception {
    public InvalidMileageException(String message) {
        super(message);
    }
}

class Vehicle {
    private String name;
    private LocalDate serviceDate;
    private int mileage;

    public Vehicle(String name, LocalDate serviceDate, int mileage) {
        this.name = name;
        this.serviceDate = serviceDate;
        this.mileage = mileage;
    }

    public void checkMaintenance() throws ServiceOverdueException, InvalidMileageException {
        LocalDate today = LocalDate.now();

        if (mileage < 0) {
            throw new InvalidMileageException("Invalid mileage reading: " + mileage);
        }

        if (serviceDate.isBefore(today)) {
            throw new ServiceOverdueException("Service is overdue for vehicle: " + name);
        }

        System.out.println("Vehicle " + name + " is in good condition. No maintenance needed.");
    }
}

public class VehicleMaintenanceDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Honda City", LocalDate.of(2024, 10, 10), 15000);

        try {
            v1.checkMaintenance();
        } catch (ServiceOverdueException e) {
            System.out.println(e.getMessage());
        } catch (InvalidMileageException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Maintenance check completed.");
        }
    }
}
