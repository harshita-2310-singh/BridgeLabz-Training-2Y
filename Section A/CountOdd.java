import java.util.*;
public class CountOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int count = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 != 0)
                count++;
        }

        System.out.println("Odd count: " + count);
    }
}
