import java.util.*;
public class UniqueDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] freq = new int[10];

        while (n > 0) {
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }

        int unique = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0)
                unique++;
        }

        System.out.println(unique);
    }
}
