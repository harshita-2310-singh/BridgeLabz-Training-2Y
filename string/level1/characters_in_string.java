import java.util.*;
public class characters_in_string {
		    public static char[] getCharsFromString(String str) {
		        int length = str.length();
		        char[] result = new char[length];

		        for (int i = 0; i < length; i++) {
		            result[i] = str.charAt(i);  
		        }

		        return result;
		    }
		    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
		        if (arr1.length != arr2.length) {
		            return false; 
		        }

		        for (int i = 0; i < arr1.length; i++) {
		            if (arr1[i] != arr2[i]) {
		                return false; 
		            }
		        }

		        return true;  
		    }
		    public static void printCharArray(char[] arr) {
		    	    for (int i = 0; i < arr.length; i++) {
		    	        System.out.print(arr[i] + " ");
		    	    }
		    	    System.out.println();
		    	}


		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String input = scanner.next();
		        char[] customCharArray = getCharsFromString(input);
		        char[] builtInCharArray = input.toCharArray();
		        boolean arraysEqual = compareCharArrays(customCharArray, builtInCharArray);
		        System.out.print("Custom char array:    ");
		        printCharArray(customCharArray);

		        System.out.print("Built-in char array:  ");
		        printCharArray(builtInCharArray);

		        System.out.println("Are both arrays equal? " + arraysEqual);
		    }
		}


	
