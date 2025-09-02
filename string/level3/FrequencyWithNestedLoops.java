import java.util.Scanner;

public class FrequencyWithNestedLoops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String input = takeInput(scanner);

        
        String[] result = getCharacterFrequencies(input);

       
        displayFrequencies(result);

        scanner.close();
    }
    public static String takeInput(Scanner scanner) {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }
    public static String[] getCharacterFrequencies(String text) {
        char[] chars = text.toCharArray();
        int len = chars.length;
        int[] freq = new int[len];

      
        for (int i = 0; i < len; i++) {
            freq[i] = 1;  

            if (chars[i] != '0') {
                for (int j = i + 1; j < len; j++) {
                    if (chars[i] == chars[j]) {
                        freq[i]++;
                        chars[j] = '0'; 
                    }
                }
            }
        }
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " - " + freq[i];
                index++;
            }
        }

        return result;
    }
    public static void displayFrequencies(String[] data) {
        System.out.println("\nCharacter Frequencies:");
        System.out.println("-----------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
