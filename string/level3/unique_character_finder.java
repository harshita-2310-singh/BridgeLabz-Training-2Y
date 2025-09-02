import java.util.*;
public class unique_character_finder {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine();

		    
		        char[] uniqueChars = findUniqueCharacters(input);

		       
		        System.out.println("Unique characters in the string:");
		        for (int i = 0; i < uniqueChars.length; i++) {
		            if (uniqueChars[i] != '\0') {
		                System.out.print(uniqueChars[i] + " ");
		            }
		        }

		        scanner.close();
		    }

		    public static char[] findUniqueCharacters(String text) {
		        int len = text.length();
		        char[] unique = new char[len];
		        int count = 0;

		        for (int i = 0; i < len; i++) {
		            char current = text.charAt(i);
		            boolean isUnique = true;
		            for (int j = 0; j < count; j++) {
		                if (unique[j] == current) {
		                    isUnique = false;
		                    break;
		                }
		            }

		            if (isUnique) {
		                unique[count] = current;
		                count++;
		            }
		        }
		        char[] result = new char[count];
		        for (int i = 0; i < count; i++) {
		            result[i] = unique[i];
		        }

		        return result;
		    }
		}
