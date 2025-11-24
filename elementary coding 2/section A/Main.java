import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter first 3-digit number: ");
        int input1 = sc.nextInt();

        System.out.print("Enter second 3-digit number: ");
        int input2 = sc.nextInt();

        System.out.print("Enter third 3-digit number: ");
        int input3 = sc.nextInt();
 
        int u1 = input1 % 10;          int t1 = (input1 / 10) % 10;      int h1 = input1 / 100;
        int u2 = input2 % 10;          int t2 = (input2 / 10) % 10;      int h2 = input2 / 100;
        int u3 = input3 % 10;          int t3 = (input3 / 10) % 10;      int h3 = input3 / 100;


        int units = Math.min(u1, Math.min(u2, u3));
        int tens = Math.min(t1, Math.min(t2, t3));
        int hundreds = Math.min(h1, Math.min(h2, h3));

        int max = h1;
        if (h2 > max) max = h2;
        if (h3 > max) max = h3;
        if (t1 > max) max = t1;
        if (t2 > max) max = t2;
        if (t3 > max) max = t3;
        if (u1 > max) max = u1;
        if (u2 > max) max = u2;
        if (u3 > max) max = u3;

        int pin = max * 1000 + hundreds * 100 + tens * 10 + units;

        System.out.println("Generated PIN: " + pin);
    }
}
