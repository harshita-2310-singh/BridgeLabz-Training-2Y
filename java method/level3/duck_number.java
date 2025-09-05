import java.util.*;
public class duck_number {
		    public static int countDigits(int number) {
		        int count = 0;
		        int temp = Math.abs(number);
		        if (temp == 0) return 1; 

		        while (temp > 0) {
		            temp /= 10;
		            count++;
		        }
		        return count;
		    }
		    public static int[] storeDigits(int number) {
		        int count = countDigits(number);
		        int[] digits = new int[count];
		        int temp = Math.abs(number);

		        for (int i = count - 1; i >= 0; i--) {
		            digits[i] = temp % 10;
		            temp /= 10;
		        }
		        return digits;
		    }
		    public static int[] reverseDigits(int[] digits) {
		        int[] reversed = new int[digits.length];
		        for (int i = 0; i < digits.length; i++) {
		            reversed[i] = digits[digits.length - 1 - i];
		        }
		        return reversed;
		    }
		    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
		        if (arr1.length != arr2.length) return false;

		        for (int i = 0; i < arr1.length; i++) {
		            if (arr1[i] != arr2[i]) return false;
		        }
		        return true;
		    }
		    public static boolean isPalindrome(int number) {
		        int[] digits = storeDigits(number);
		        int[] reversed = reverseDigits(digits);
		        return areArraysEqual(digits, reversed);
		    }
		    public static boolean isDuckNumber(int[] digits) {
		        for (int i = 0; i < digits.length; i++) {
		            if (digits[i] != 0) {
		                return true;
		            }
		        }
		        return false;
		    }
		    public static void main(String[] args) {
		        int number = 12321;  

		        System.out.println("Number: " + number);

		        int digitCount = countDigits(number);
		        System.out.println("Count of digits: " + digitCount);

		        int[] digits = storeDigits(number);
		        System.out.println("Digits array: " + Arrays.toString(digits));

		        int[] reversed = reverseDigits(digits);
		        System.out.println("Reversed digits array: " + Arrays.toString(reversed));

		        boolean arraysEqual = areArraysEqual(digits, reversed);
		        System.out.println("Are digits and reversed digits arrays equal? " + (arraysEqual ? "Yes" : "No"));

		        boolean palindrome = isPalindrome(number);
		        System.out.println("Is the number a palindrome? " + (palindrome ? "Yes" : "No"));

		        boolean duck = isDuckNumber(digits);
		        System.out.println("Is the number a duck number? " + (duck ? "Yes" : "No"));
		    }
		}