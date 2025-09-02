import java.util.*;
public class type_checker {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.println("Enter a string:");
		        String input = scanner.nextLine();

		        
		        String[][] resultArray = analyzeCharacters(input);

		       
		        displayCharacterTypes(resultArray);

		        scanner.close();
		    }

		  
		    public static String getCharacterType(char c) {
		        
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

		    
		    public static String[][] analyzeCharacters(String text) {
		        int len = text.length();
		        String[][] result = new String[len][2];

		        for (int i = 0; i < len; i++) {
		            char ch = text.charAt(i);
		            result[i][0] = String.valueOf(ch);
		            result[i][1] = getCharacterType(ch);
		        }

		        return result;
		    }

		    
		    public static void displayCharacterTypes(String[][] data) {
		        System.out.println("\nCharacter\tType");
		        System.out.println("-------------------------");
		        for (int i = 0; i < data.length; i++) {
		            System.out.println("   " + data[i][0] + "\t\t" + data[i][1]);
		        }
		    }
		}

