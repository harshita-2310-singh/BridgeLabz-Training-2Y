import java.util.*;
public class split_text_into_words {
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
		    public static boolean compareArrays(String[] arr1, String[] arr2) {
		        if (arr1.length != arr2.length) return false;
		        for (int i = 0; i < arr1.length; i++) {
		            if (!arr1[i].equals(arr2[i])) {
		                return false;
		            }
		        }
		        return true;
		    }
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a sentence: ");
		        String input = scanner.nextLine();
		        String[] builtInSplit = input.split(" ");
		        String[] customSplitResult = customSplit(input);
		        boolean areEqual = compareArrays(builtInSplit, customSplitResult);
		        System.out.println("\nBuilt-in split result:");
		        for (int i = 0; i < builtInSplit.length; i++) {
		            System.out.println(builtInSplit[i]);
		        }

		        for (int i = 0; i < customSplitResult.length; i++) {
		            System.out.println(customSplitResult[i]);
		        }


		        System.out.println("\nComparison result: " + (areEqual ? "Both methods give the same result." : "Results are different."));
		    }
		}

