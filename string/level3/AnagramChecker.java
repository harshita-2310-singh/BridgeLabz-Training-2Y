import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter first text: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter second text: ");
        String text2 = scanner.nextLine();
        boolean result = isAnagram(text1, text2);
        System.out.println("\nAre the two texts anagrams?");
        System.out.println(result ? "YES, they are anagrams." : " NO, they are not anagrams.");

        scanner.close();
    }
    public static boolean isAnagram(String str1, String str2) {
    
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] freq1 = new int[256];  
        int[] freq2 = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            freq1[str1.charAt(i)]++;
            freq2[str2.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }
}
