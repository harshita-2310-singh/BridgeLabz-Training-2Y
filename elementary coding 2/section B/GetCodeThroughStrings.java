import java.util.Scanner;

public class GetCodeThroughStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String input1 = sc.nextLine();

        String[] words = input1.trim().split("\\s+");
        int totalLength = 0;

     
        for (String w : words) {
            totalLength += w.length();
        }

      
        while (totalLength > 9) {
            int sum = 0;
            while (totalLength > 0) {
                sum += totalLength % 10;
                totalLength /= 10;
            }
            totalLength = sum;
        }

        System.out.println("Single-digit PIN = " + totalLength);
    }
}
