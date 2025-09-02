import java.util.*;
public class vowel_consonant {

	public static void main(String[] args) 
	{
		        Scanner scanner = new Scanner(System.in);

		       
		        System.out.println("Enter a string:");
		        String input = scanner.nextLine();

		      
		        int[] result = countVowelsAndConsonants(input);

		      
		        System.out.println("Number of Vowels: " + result[0]);
		        System.out.println("Number of Consonants: " + result[1]);

		        scanner.close();
		    }

		   
		    public static String checkCharacterType(char c) {
		      
		        if (c >= 'A' && c <= 'Z') {
		            c = (char)(c + 32);
		        }
		        if (c >= 'a' && c <= 'z') {
		            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
		                return "Vowel";
		            } else {
		                return "Consonant";
		            }
		        } else {
		            return "Not a Letter";
		        }
		    }
		    public static int[] countVowelsAndConsonants(String text) {
		        int vowels = 0;
		        int consonants = 0;

		        for (int i = 0; i < text.length(); i++) {
		            char ch = text.charAt(i);
		            String type = checkCharacterType(ch);

		            if (type.equals("Vowel")) {
		                vowels++;
		            } else if (type.equals("Consonant")) {
		                consonants++;
		            }
		        }

		        return new int[]{vowels, consonants};
		    }
		}


	
