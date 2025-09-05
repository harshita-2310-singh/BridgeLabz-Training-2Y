import java.util.*;
public class buzz_number {
		    public static boolean isPrime(int num) {
		        if (num <= 1) {
		            return false;
		        }
		        for (int i = 2; i <= num / 2; i++) {
		            if (num % i == 0) {
		                return false;
		            }
		        }
		        return true;
		    }

		    public static boolean isNeon(int num) {
		        int square = num * num;
		        int sum = 0;
		        while (square > 0) {
		            sum += square % 10;
		            square = square / 10;
		        }
		        return sum == num;
		    }
		    public static boolean isSpy(int num) {
		        int sum = 0;
		        int product = 1;
		        int temp = num;
		        while (temp > 0) {
		            int digit = temp % 10;
		            sum += digit;
		            product *= digit;
		            temp = temp / 10;
		        }
		        return sum == product;
		    }
		    public static boolean isAutomorphic(int num) {
		        int square = num * num;
		        String numStr = String.valueOf(num);
		        String squareStr = String.valueOf(square);
		        return squareStr.endsWith(numStr);
		    }
		    public static boolean isBuzz(int num) {
		        return (num % 7 == 0) || (num % 10 == 7);
		    }
		    public static void main(String[] args) {
		        int[] testNumbers = {2, 5, 7, 9, 10, 13, 25, 135, 76};

		        int i = 0;
		        while (i < testNumbers.length) {
		            int num = testNumbers[i];

		            System.out.println("Checking number: " + num);
		            System.out.println("Is Prime?       : " + isPrime(num));
		            System.out.println("Is Neon?        : " + isNeon(num));
		            System.out.println("Is Spy?         : " + isSpy(num));
		            System.out.println("Is Automorphic? : " + isAutomorphic(num));
		            System.out.println("Is Buzz?        : " + isBuzz(num));
		            System.out.println("----------------------------------");

		            i++;
		        }
		    }
		}
