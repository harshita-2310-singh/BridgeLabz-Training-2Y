import java.util.Scanner;

public class PalindromeCheckSTRING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String original = str.toLowerCase();   
        String reverse = "";

    
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        
        if (original.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
