import java.util.*;
public class number_checker {
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
	    public static boolean isDuckNumber(int[] digits) {
	        for (int i = 0; i < digits.length; i++) {
	            if (digits[i] != 0) {
	                return true;
	            }
	        }
	        return false;
	    }
	    public static boolean isArmstrongNumber(int number, int[] digits) {
	        int count = digits.length;
	        int sum = 0;

	        for (int i = 0; i < digits.length; i++) {
	            sum += Math.pow(digits[i], count);
	        }

	        return sum == Math.abs(number);
	    }
	    public static int[] findLargestAndSecondLargest(int[] digits) {
	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int i = 0; i < digits.length; i++) {
	            if (digits[i] > largest) {
	                secondLargest = largest;
	                largest = digits[i];
	            } else if (digits[i] > secondLargest && digits[i] != largest) {
	                secondLargest = digits[i];
	            }
	        }
	        return new int[]{largest, secondLargest};
	    }
	    public static int[] findSmallestAndSecondSmallest(int[] digits) {
	        int smallest = Integer.MAX_VALUE;
	        int secondSmallest = Integer.MAX_VALUE;

	        for (int i = 0; i < digits.length; i++) {
	            if (digits[i] < smallest) {
	                secondSmallest = smallest;
	                smallest = digits[i];
	            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
	                secondSmallest = digits[i];
	            }
	        }
	        return new int[]{smallest, secondSmallest};
	    }

	    public static void main(String[] args) {
	        int number = 153;

	        System.out.println("Number: " + number);

	        int digitCount = countDigits(number);
	        System.out.println("Count of digits: " + digitCount);

	        int[] digits = storeDigits(number);
	        System.out.println("Digits array: " + Arrays.toString(digits));

	        boolean duck = isDuckNumber(digits);
	        System.out.println("Is Duck Number? " + (duck ? "Yes" : "No"));

	        boolean armstrong = isArmstrongNumber(number, digits);
	        System.out.println("Is Armstrong Number? " + (armstrong ? "Yes" : "No"));

	        int[] largestTwo = findLargestAndSecondLargest(digits);
	        System.out.println("Largest digit: " + largestTwo[0]);
	        System.out.println("Second Largest digit: " + (largestTwo[1] == Integer.MIN_VALUE ? "None" : Integer.toString(largestTwo[1])));

	        int[] smallestTwo = findSmallestAndSecondSmallest(digits);
	        System.out.println("Smallest digit: " + smallestTwo[0]);
	        System.out.println("Second Smallest digit: " + (smallestTwo[1] == Integer.MAX_VALUE ? "None" : Integer.toString(smallestTwo[1])));
	    }
	}
