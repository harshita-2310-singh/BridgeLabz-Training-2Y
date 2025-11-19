import java.util.*;
public class PrimesInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int start = sc.nextInt();
        int end = sc.nextInt();

        int total = 0;

        for (int num = start; num <= end; num++) {

            if (num <= 1) continue;

            int flag = 1;

            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    flag = 0;
                    break;
                }
            }

            if (flag == 1) total++;
        }

        System.out.println("Primes count: " + total);
    }
}
