import java.util.Scanner;

public class AgeValidation {

    public static boolean isValidAge(String input) {
        try {
            int age = Integer.parseInt(input);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String input = sc.nextLine();

        if (isValidAge(input)) {
            System.out.println("Valid age. Signup allowed.");
        } else {
            System.out.println("Invalid age. Must be 18 or older.");
        }

        sc.close();
    }
}
