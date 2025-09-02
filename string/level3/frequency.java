import java.util.*;
public class frequency {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        String input = takeInput(scanner);
		        String[][] frequencies = getCharFrequencies(input);

		       
		        displayFrequencies(frequencies);

		        scanner.close();
		    }

		   
		    public static String takeInput(Scanner scanner) {
		        System.out.print("Enter a string: ");
		        return scanner.nextLine();
		    }
		    public static String[][] getCharFrequencies(String text) {
		        int[] freq = new int[256];  
		        for (int i = 0; i < text.length(); i++) {
		            char ch = text.charAt(i);
		            freq[ch]++;
		        }
		        String[][] result = new String[text.length()][2];
		        int index = 0;

		        for (int i = 0; i < text.length(); i++) {
		            char ch = text.charAt(i);
		            if (freq[ch] > 0) {
		                result[index][0] = String.valueOf(ch);
		                result[index][1] = String.valueOf(freq[ch]);
		                freq[ch] = 0; 
		                index++;
		            }
		        }
		        String[][] finalResult = new String[index][2];
		        for (int i = 0; i < index; i++) {
		            finalResult[i][0] = result[i][0];
		            finalResult[i][1] = result[i][1];
		        }

		        return finalResult;
		    }
		    public static void displayFrequencies(String[][] data) {
		        System.out.println("\nCharacter\tFrequency");
		        System.out.println("--------------------------");

		        for (int i = 0; i < data.length; i++) {
		            System.out.println("    " + data[i][0] + "\t\t    " + data[i][1]);
		        }
		    }
		}
