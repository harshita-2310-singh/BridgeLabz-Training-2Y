// Static Import
import static java.lang.Math.*; // imports all static members of Math class

public class StaticImportDemo {
    public static void main(String[] args) {
        double num1 = 16;
        double num2 = 3;
        double num3 = -10;

        // Using Math methods without Math. prefix
        System.out.println("Square root of " + num1 + " = " + sqrt(num1));
        System.out.println(num1 + " raised to power " + num2 + " = " + pow(num1, num2));
        System.out.println("Maximum of " + num1 + " and " + num2 + " = " + max(num1, num2));
        System.out.println("Minimum of " + num1 + " and " + num2 + " = " + min(num1, num2));
        System.out.println("Absolute value of " + num3 + " = " + abs(num3));
    }
}
