class Device {
    String deviceId;
    String status;

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class hometest{
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("T1001", "ON", 22);
        Thermostat t2 = new Thermostat("T1002", "OFF", 18);

        t1.displayStatus();
        System.out.println();
        t2.displayStatus();
    }
}
