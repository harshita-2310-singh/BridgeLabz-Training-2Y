import java.util.Scanner;

public class CharacterFrequencyWithUnique {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = takeInput(scanner);
        String[][] frequencyResult = getCharacterFrequencies(input);
        displayFrequencies(frequencyResult);

        scanner.close();
    }
    public static String takeInput(Scanner scanner) {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
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
    public static String[][] getCharacterFrequencies(String text) {
        int[] freq = new int[256]; 
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        char[] uniqueChars = findUniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }
    public static void displayFrequencies(String[][] data) {
        System.out.println("\nCharacter\tFrequency");
        System.out.println("--------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println("    " + data[i][0] + "\t\t    " + data[i][1]);
        }
    }
}
