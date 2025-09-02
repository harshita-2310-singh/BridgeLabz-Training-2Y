import java.util.*;
public class uppercase {
		    public static String convertToUpperManually(String input) {
		        String result = "";

		        for (int i = 0; i < input.length(); i++) {
		            char c = input.charAt(i);
		            if (c >= 'a' && c <= 'z') {
		                c = (char)(c - 32); 
		            }

		            result += c; 
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
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter your text: ");
		        String originalText = scanner.nextLine();
		        String manualUpper = convertToUpperManually(originalText);
		        String builtInUpper = originalText.toUpperCase();
		        boolean areEqual = compareStringsUsingCharAt(manualUpper, builtInUpper);
		        System.out.println("Manual uppercase:     " + manualUpper);
		        System.out.println("Built-in uppercase:   " + builtInUpper);
		        System.out.println("Do both match?        " + areEqual);

		       
		    }
		}


	
