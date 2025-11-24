import java.util.*;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        int[] freq = new int[10];


        for (int num : arr) {
            num = Math.abs(num);
            if (num == 0) {
                freq[0]++;
            }
            while (num > 0) {
                int digit = num % 10;
                freq[digit]++;
                num /= 10;
            }
        }

 
        int maxFreq = -1;
        int mostFrequentDigit = -1;

        for (int i = 0; i <= 9; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                mostFrequentDigit = i;
            }
        }

        System.out.println("Most frequent digit: " + mostFrequentDigit);
        System.out.println("Frequency: " + maxFreq);
    }
}
