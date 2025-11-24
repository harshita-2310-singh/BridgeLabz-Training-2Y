import java.util.Scanner;

 public class PalindromeRearrange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();   

        int[] freq = new int[10]; 

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            if (Character.isDigit(ch)) {
                freq[ch - '0']++;
            } else {
                System.out.println("Invalid input");
                return;
            }
        }

        int oddCount = 0;

        for (int i = 0; i < 10; i++) {
            if (freq[i] % 2 != 0) {
                oddCount++;
            }
        }

        if (oddCount <= 1) {
            System.out.println("YES, digits can be rearranged to form a palindrome");
        } else {
            System.out.println("NO, digits cannot form a palindrome");
        }
    }
}
