import java.util.*;
public class lenght_in_2d {
		    public static int getLength(String str) {
		        int count = 0;
		        try {
		            while (true) {
		                str.charAt(count);
		                count++;
		            }
		        } catch (Exception e) {
		            
		        }
		        return count;
		    }

		  
		    public static String[] customSplit(String str) {
		        int length = str.length();
		        int spaceCount = 0;

		       
		        for (int i = 0; i < length; i++) {
		            if (str.charAt(i) == ' ') {
		                spaceCount++;
		            }
		        }

		        int[] spaceIndexes = new int[spaceCount];
		        int index = 0;

		       
		        for (int i = 0; i < length; i++) {
		            if (str.charAt(i) == ' ') {
		                spaceIndexes[index++] = i;
		            }
		        }

		       
		        String[] words = new String[spaceCount + 1];
		        int start = 0;

		        for (int i = 0; i < spaceCount; i++) {
		            int end = spaceIndexes[i];
		            words[i] = extractSubstring(str, start, end);
		            start = end + 1;
		        }

		        
		        words[spaceCount] = extractSubstring(str, start, length);

		        return words;
		    }

		    
		    public static String extractSubstring(String str, int start, int end) {
		        String result = "";
		        for (int i = start; i < end; i++) {
		            result += str.charAt(i);
		        }
		        return result;
		    }

		    
		    public static String[][] getWordLengths(String[] words) {
		        String[][] wordLengthArray = new String[words.length][2];

		        for (int i = 0; i < words.length; i++) {
		            wordLengthArray[i][0] = words[i];
		            int len = getLength(words[i]);
		            wordLengthArray[i][1] = String.valueOf(len);
		        }

		        return wordLengthArray;
		    }

		    
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		       
		        System.out.print("Enter a sentence: ");
		        String input = scanner.nextLine();
		        String[] words = customSplit(input);
		        String[][] wordLengthArray = getWordLengths(words);
		        System.out.println("\nWord\t\tLength");
		        System.out.println("------------------------");

		        for (int i = 0; i < wordLengthArray.length; i++) {
		            String word = wordLengthArray[i][0];
		            int length = Integer.parseInt(wordLengthArray[i][1]); 
		            System.out.println(word + "\t\t" + length);
		        }
		    }
		}
