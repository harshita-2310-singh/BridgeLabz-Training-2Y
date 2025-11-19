import java.util.*;
public class NthPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0, num = 2;

        while (true) {
            int flag = 1;

            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    flag = 0;
                    break;
                }
            }

            if (flag == 1) count++;

            if (count == n) {
                System.out.println(num);
                break;
            }

            num++;
        }
    }
}
