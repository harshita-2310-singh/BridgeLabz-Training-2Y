import java.util.*;
public class substring {
	    public static String createSubstringUsingCharAt(String str, int start, int end) {
	        String result = "";
	        for (int i = start; i < end; i++) {
	            result += str.charAt(i);
	        }
	        return result;
	    }
	    public static boolean compareStringsUsingCharAt(String str1, String str2) {
	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        for (int i = 0; i < str1.length(); i++) {
	            if (str1.charAt(i) != str2.charAt(i)) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String original = sc.next();

	        System.out.print("Enter start index: ");
	        int start = sc.nextInt();

	        System.out.print("Enter end index: ");
	        int end = sc.nextInt();
	        String manualSubstring = createSubstringUsingCharAt(original, start, end);
	        String builtInSubstring = original.substring(start, end);
	        boolean comparisonResult = compareStringsUsingCharAt(manualSubstring, builtInSubstring);
	        
	        System.out.println("Substring using charAt(): " + manualSubstring);
	        System.out.println("Substring using built-in substring(): " + builtInSubstring);
	        System.out.println("Are both substrings equal? " + comparisonResult);

	       
	    }
	}



