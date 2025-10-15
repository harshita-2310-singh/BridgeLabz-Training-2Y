@FunctionalInterface
interface TemperatureAlert {
    void checkTemperature(int temperature);
}

public class TemperatureAlertSystemLambda {
    public static void main(String[] args) {
        int threshold = 30;

        TemperatureAlert alert = (temperature) -> {
            if (temperature > threshold) {
                System.out.println("Alert! Temperature crossed the threshold: " + temperature);
            } else {
                System.out.println("Temperature is normal: " + temperature);
            }
        };

        alert.checkTemperature(25);
        alert.checkTemperature(35);
    }
}
