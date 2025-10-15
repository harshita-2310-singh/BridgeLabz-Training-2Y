interface TemperatureAlert {
    void checkTemperature(int temperature);
}

class AlertSystem implements TemperatureAlert {
    private int threshold;

    public AlertSystem(int threshold) {
        this.threshold = threshold;
    }

    public void checkTemperature(int temperature) {
        if (temperature > threshold) {
            System.out.println("Alert! Temperature crossed the threshold: " + temperature);
        } else {
            System.out.println("Temperature is normal: " + temperature);
        }
    }
}

public class TemperatureAlertSystem {
    public static void main(String[] args) {
        TemperatureAlert alert = new AlertSystem(30);

        alert.checkTemperature(25);
        alert.checkTemperature(35);
    }
}
