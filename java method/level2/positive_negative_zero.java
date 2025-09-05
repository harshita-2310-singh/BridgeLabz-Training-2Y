import java.util.*;
public class positive_negative_zero {
		    public static boolean isPositive(int number) {
		        return number >= 0;
		    }
		    public static boolean isEven(int number) {
		        return number % 2 == 0;
		    }
		    public static int compare(int n1, int n2) {
		        if (n1 > n2) {
		            return 1;
		        } else if (n1 == n2) {
		            return 0;
		        } else {
		            return -1;
		        }
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int[] numbers = new int[5];
		        for (int i = 0; i < numbers.length; i++) {
		            System.out.print("Enter number " + (i + 1) + ": ");
		            numbers[i] = scanner.nextInt();

		            if (isPositive(numbers[i])) {
		                System.out.print("Number is positive and ");
		                if (isEven(numbers[i])) {
		                    System.out.println("even.");
		                } else {
		                    System.out.println("odd.");
		                }
		            } else {
		                System.out.println("Number is negative.");
		            }
		        }
		        int result = compare(numbers[0], numbers[4]);
		        System.out.print("\nComparison of first and last elements: ");
		        if (result == 1) {
		            System.out.println("First number is greater than the last number.");
		        } else if (result == 0) {
		            System.out.println("First and last numbers are equal.");
		        } else {
		            System.out.println("First number is less than the last number.");
		        }

		        scanner.close();
		    }
		}
