import java.util.*;
public class non_repeating {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		     
		        System.out.print("Enter a string: ");
		        String text = scanner.nextLine();
		        char result = findFirstNonRepeatingChar(text);
		        if (result != '\0') {
		            System.out.println("First non-repeating character: " + result);
		        } else {
		            System.out.println("No non-repeating character found.");
		        }

		        scanner.close();
		    }
		    public static char findFirstNonRepeatingChar(String text) {
		        int[] freq = new int[256];

		       
		        for (int i = 0; i < text.length(); i++) {
		            char ch = text.charAt(i);
		            freq[ch]++;
		        }

		       
		        for (int i = 0; i < text.length(); i++) {
		            char ch = text.charAt(i);
		            if (freq[ch] == 1) {
		                return ch;
		            }
		        }

		        return '\0';
		    }
		}


	
