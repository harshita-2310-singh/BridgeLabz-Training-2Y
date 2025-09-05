
public class sumofproperdivision {
		    public static int sumOfProperDivisors(int number) {
		        int sum = 1;
		        if (number == 1) return 0; 
		        int limit = (int) Math.sqrt(number);
		        for (int i = 2; i <= limit; i++) {
		            if (number % i == 0) {
		                sum += i;
		                int otherDivisor = number / i;
		                if (otherDivisor != i) {
		                    sum += otherDivisor;
		                }
		            }
		        }
		        return sum;
		    }
		    public static boolean isPerfect(int number) {
		        if (number <= 0) return false;
		        return sumOfProperDivisors(number) == number;
		    }

		    public static boolean isAbundant(int number) {
		        if (number <= 0) return false;
		        return sumOfProperDivisors(number) > number;
		    }
		    public static boolean isDeficient(int number) {
		        if (number <= 0) return false;
		        return sumOfProperDivisors(number) < number;
		    }
		    public static int factorial(int digit) {
		        int fact = 1;
		        for (int i = 2; i <= digit; i++) {
		            fact *= i;
		        }
		        return fact;
		    }
		    public static boolean isStrong(int number) {
		        if (number < 0) return false;

		        int temp = number;
		        int sumFactorials = 0;

		        while (temp > 0) {
		            int digit = temp % 10;
		            sumFactorials += factorial(digit);
		            temp /= 10;
		        }
		        return sumFactorials == number;
		    }
		    public static void main(String[] args) {
		        int[] testNumbers = {6, 12, 15, 28, 145, 496, 18, 1};

		        for (int i = 0; i < testNumbers.length; i++) {
		            int number = testNumbers[i];
		            System.out.println("Number: " + number);
		            System.out.println("Is Perfect? " + (isPerfect(number) ? "Yes" : "No"));
		            System.out.println("Is Abundant? " + (isAbundant(number) ? "Yes" : "No"));
		            System.out.println("Is Deficient? " + (isDeficient(number) ? "Yes" : "No"));
		            System.out.println("Is Strong? " + (isStrong(number) ? "Yes" : "No"));
		            System.out.println("---------------------------------");
		        }
		    }
		}
