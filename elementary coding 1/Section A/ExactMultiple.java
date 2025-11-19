import java.util.*;
public class ExactMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n % m == 0)
            System.out.println("Exact multiple");
        else
            System.out.println("Not an exact multiple");
    }
}
