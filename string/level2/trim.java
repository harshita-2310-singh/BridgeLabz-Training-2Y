import java.util.*;
public class trim {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter a string with leading and trailing spaces:");
		        String input = scanner.nextLine();
		        int[] trimIndices = findTrimIndices(input);
		        int start = trimIndices[0];
		        int end = trimIndices[1];
		        String manuallyTrimmed = manualSubstring(input, start, end);
		        String builtInTrimmed = input.trim();
		        boolean isSame = compareStrings(manuallyTrimmed, builtInTrimmed);

		       
		        System.out.println("\nOriginal string: \"" + input + "\"");
		        System.out.println("Manually trimmed string: \"" + manuallyTrimmed + "\"");
		        System.out.println("Built-in trimmed string: \"" + builtInTrimmed + "\"");
		        System.out.println("Do they match? " + isSame);

		        scanner.close();
		    }

		   
		    public static int[] findTrimIndices(String text) {
		        int start = 0;
		        int end = text.length() - 1;

		      
		        while (start < text.length() && text.charAt(start) == ' ') {
		            start++;
		        }

		       
		        while (end >= 0 && text.charAt(end) == ' ') {
		            end--;
		        }

		        
		        if (start > end) {
		            return new int[]{0, -1};
		        }

		        return new int[]{start, end};
		    }

		   
		    public static String manualSubstring(String text, int start, int end) {
		        String result = "";

		        for (int i = start; i <= end; i++) {
		            result += text.charAt(i);
		        }

		        return result;
		    }

		  
		    public static boolean compareStrings(String s1, String s2) {
		        if (s1.length() != s2.length()) {
		            return false;
		        }

		        for (int i = 0; i < s1.length(); i++) {
		            if (s1.charAt(i) != s2.charAt(i)) {
		                return false;
		            }
		        }

		        return true;
		    }
		}


	
