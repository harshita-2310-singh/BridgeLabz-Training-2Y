import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        boolean isPalindrome1 = isPalindromeIterative(text);
        boolean isPalindrome2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean isPalindrome3 = isPalindromeByCharArray(text);
        System.out.println("\n--- Palindrome Check Results ---");
        System.out.println("Using Logic 1 (Start-End Index Loop): " + (isPalindrome1 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Logic 2 (Recursion): " + (isPalindrome2 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Logic 3 (Char Arrays and Reversal): " + (isPalindrome3 ? "Palindrome" : "Not a Palindrome"));

        scanner.close();
    }
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return isPalindromeRecursive(text, start + 1, end - 1);
    }
    public static boolean isPalindromeByCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseUsingCharAt(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }

        return true;
    }
    public static char[] reverseUsingCharAt(String text) {
        int len = text.length();
        char[] reversed = new char[len];

        for (int i = 0; i < len; i++) {
            reversed[i] = text.charAt(len - 1 - i);
        }

        return reversed;
    }
}
