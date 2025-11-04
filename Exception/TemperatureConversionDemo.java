import java.util.Scanner;

class InvalidTemperatureException extends Exception {
    public InvalidTemperatureException(String message) {
        super(message);
    }
}

class TemperatureConverter {
    public double convert(double value, char unit) throws InvalidTemperatureException {
        if ((unit == 'C' || unit == 'c') && value < -273.15) {
            throw new InvalidTemperatureException("Error: Temperature below absolute zero is not possible!");
        } else if ((unit == 'F' || unit == 'f') && value < -459.67) {
            throw new InvalidTemperatureException("Error: Temperature below absolute zero is not possible!");
        }

        if (unit == 'C' || unit == 'c') {
            return (value * 9 / 5) + 32;
        } else if (unit == 'F' || unit == 'f') {
            return (value - 32) * 5 / 9;
        } else {
            throw new InvalidTemperatureException("Error: Invalid temperature unit.");
        }
    }
}

public class TemperatureConversionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TemperatureConverter converter = new TemperatureConverter();

        System.out.print("Enter temperature value: ");
        double value = sc.nextDouble();

        System.out.print("Enter unit (C/F): ");
        char unit = sc.next().charAt(0);

        try {
            double result = converter.convert(value, unit);
            if (unit == 'C' || unit == 'c') {
                System.out.println("Converted temperature: " + result + "°F");
            } else {
                System.out.println("Converted temperature: " + result + "°C");
            }
        } catch (InvalidTemperatureException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Conversion process completed.");
        }

        sc.close();
    }
}
