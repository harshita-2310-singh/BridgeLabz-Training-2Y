import java.util.*;
public class text_analyser {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter a text:");
		        String input = scanner.nextLine();

		        String[] words = splitIntoWords(input);
		        String[][] wordsWithLengths = getWordsWithLengths(words);
		        int[] shortestAndLongest = findShortestAndLongest(wordsWithLengths);

		        System.out.println("Shortest word: " + words[shortestAndLongest[0]]);
		        System.out.println("Longest word: " + words[shortestAndLongest[1]]);

		        scanner.close();
		    }

		  
		    public static String[] splitIntoWords(String text) {
		        String[] temp = new String[text.length()];
		        int wordCount = 0;
		        String currentWord = "";

		        for (int i = 0; i < text.length(); i++) {
		            char c = text.charAt(i);
		            if (c != ' ') {
		                currentWord += c;
		            } else {
		                if (!currentWord.equals("")) {
		                    temp[wordCount++] = currentWord;
		                    currentWord = "";
		                }
		            }
		        }
		        if (!currentWord.equals("")) {
		            temp[wordCount++] = currentWord;
		        }
		        String[] words = new String[wordCount];
		        for (int i = 0; i < wordCount; i++) {
		            words[i] = temp[i];
		        }
		        return words;
		    }
		    public static String[][] getWordsWithLengths(String[] words) {
		        String[][] result = new String[words.length][2];
		        for (int i = 0; i < words.length; i++) {
		            result[i][0] = words[i];
		            result[i][1] = String.valueOf(words[i].length());
		        }
		        return result;
		    }
		    public static int[] findShortestAndLongest(String[][] wordsWithLengths) {
		        int minIndex = 0;
		        int maxIndex = 0;

		        for (int i = 1; i < wordsWithLengths.length; i++) {
		            int currentLength = Integer.parseInt(wordsWithLengths[i][1]);
		            int minLength = Integer.parseInt(wordsWithLengths[minIndex][1]);
		            int maxLength = Integer.parseInt(wordsWithLengths[maxIndex][1]);

		            if (currentLength < minLength) {
		                minIndex = i;
		            }
		            if (currentLength > maxLength) {
		                maxIndex = i;
		            }
		        }

		        return new int[]{minIndex, maxIndex};
		    }
		}


	
