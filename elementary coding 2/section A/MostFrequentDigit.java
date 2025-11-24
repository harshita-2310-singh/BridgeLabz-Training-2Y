import java.util.Scanner;

public class MostFrequentDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.nextLine();

        int[] freq = new int[10]; 

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);

            if (Character.isDigit(ch)) {
                freq[ch - '0']++;   
            }
        }

    
        int mostFreqDigit = 0;
        int maxCount = 0;

        for (int i = 0; i < 10; i++) {
            if (freq[i] > maxCount) {
                maxCount = freq[i];
                mostFreqDigit = i;
            }
        }

        System.out.println("Most frequent digit = " + mostFreqDigit);
    }
}
