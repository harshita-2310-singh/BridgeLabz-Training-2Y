import java.util.*;
public class frequency_digit {
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
		    public static int sumOfDigits(int[] digits) {
		        int sum = 0;
		        for (int i = 0; i < digits.length; i++) {
		            sum += digits[i];
		        }
		        return sum;
		    }
		    public static int sumOfSquaresOfDigits(int[] digits) {
		        int sumSquares = 0;
		        for (int i = 0; i < digits.length; i++) {
		            sumSquares += (int) Math.pow(digits[i], 2);
		        }
		        return sumSquares;
		    }
		    public static boolean isHarshadNumber(int number, int[] digits) {
		        int sumDigits = sumOfDigits(digits);
		        if (sumDigits == 0) return false; 
		        return number % sumDigits == 0;
		    }
		    public static int[][] findDigitFrequency(int[] digits) {
		        int[][] freqArray = new int[10][2];
		        for (int i = 0; i < 10; i++) {
		            freqArray[i][0] = i;
		            freqArray[i][1] = 0; 
		        }

		        for (int i = 0; i < digits.length; i++) {
		            int digit = digits[i];
		            freqArray[digit][1] += 1;
		        }

		        return freqArray;
		    }
		    public static void main(String[] args) {
		        int number = 214; 

		        System.out.println("Number: " + number);

		        int digitCount = countDigits(number);
		        System.out.println("Count of digits: " + digitCount);

		        int[] digits = storeDigits(number);
		        System.out.println("Digits array: " + Arrays.toString(digits));

		        int sumDigits = sumOfDigits(digits);
		        System.out.println("Sum of digits: " + sumDigits);

		        int sumSquares = sumOfSquaresOfDigits(digits);
		        System.out.println("Sum of squares of digits: " + sumSquares);

		        boolean harshad = isHarshadNumber(number, digits);
		        System.out.println("Is Harshad Number? " + (harshad ? "Yes" : "No"));

		        int[][] frequency = findDigitFrequency(digits);
		        System.out.println("Digit frequencies:");
		        System.out.println("Digit : Frequency");
		        for (int i = 0; i < frequency.length; i++) {
		            System.out.println(frequency[i][0] + "     : " + frequency[i][1]);
		        }
		    }
		}
