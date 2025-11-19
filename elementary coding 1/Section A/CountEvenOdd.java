import java.util.*;
public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int even = 0, odd = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even total: " + even);
        System.out.println("Odd total: " + odd);
    }
}
