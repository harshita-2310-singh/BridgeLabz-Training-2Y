import java.util.*;

public class sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isDecreasing = true;

        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i - 1]) {
                isDecreasing = false;
                break;
            }
        }

        if (isDecreasing)
            System.out.println("The sequence is strictly decreasing.");
        else
            System.out.println("The sequence is NOT strictly decreasing.");
    }
}
