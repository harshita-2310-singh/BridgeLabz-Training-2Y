import java.util.Scanner;
public class factors{
		    public static int[] findFactors(int number) {
		    	int count = 0;
		        for (int i = 1; i <= number; i++) {
		            if (number % i == 0) {
		                count++;
		            }
		        }
		        int[] factors = new int[count];
		        int index = 0;
		        for (int i = 1; i <= number; i++) {
		            if (number % i == 0) {
		                factors[index++] = i;
		            }
		        		        }

		        return factors;
		    }
		    public static int sumOfFactors(int[] factors) {
		    	 int sum = 0;
		         for (int i = 0; i < factors.length; i++) {
		             sum += factors[i];
		         }
		         return sum;
		     }
		    public static long productOfFactors(int[] factors) {
		    	long product = 1;
		        for (int i = 0; i < factors.length; i++) {
		            product *= factors[i];
		        }
		        return product;
		    }

		    public static long sumOfSquaresOfFactors(int[] factors) {
		        long sumSquares = 0;
		        for (int i = 0; i < factors.length; i++) {
		            sumSquares += Math.pow(factors[i], 2);
		        }
		        return sumSquares;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter an integer number: ");
		        int number = scanner.nextInt();

		        if (number <= 0) {
		            System.out.println("Please enter a positive integer.");
		        } else {
		            int[] factors = findFactors(number);
		            System.out.print("Factors of " + number + " are: ");
		            for (int i = 0; i < factors.length; i++) {
		                System.out.print(factors[i] + " ");
		            }
		            System.out.println();
		            int sum = sumOfFactors(factors);
		            long product = productOfFactors(factors);
		            long sumSquares = sumOfSquaresOfFactors(factors);
		            System.out.println("Sum of factors: " + sum);
		            System.out.println("Product of factors: " + product);
		            System.out.println("Sum of squares of factors: " + sumSquares);
		        }

		        scanner.close();
		    }
		}
