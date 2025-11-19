import java.util.*;
public class DigitSumOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String choice = sc.next();   // "even" or "odd"

        int sum = 0;

        while (n > 0) {
            int d = n % 10;

            if (choice.equalsIgnoreCase("even") && d % 2 == 0)
                sum += d;

            if (choice.equalsIgnoreCase("odd") && d % 2 != 0)
                sum += d;

            n /= 10;
        }

        System.out.println(sum);
    }
}
