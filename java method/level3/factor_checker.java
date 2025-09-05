
public class factor_checker {
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
		    public static int findGreatestFactor(int[] factors, int number) {
		        int greatest = 1; 
		        for (int i = 0; i < factors.length; i++) {
		            if (factors[i] != number && factors[i] > greatest) {
		                greatest = factors[i];
		            }
		        }
		        return greatest;
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
		    public static double productOfCubesOfFactors(int[] factors) {
		        double product = 1;
		        for (int i = 0; i < factors.length; i++) {
		            product *= Math.pow(factors[i], 3);
		        }
		        return product;
		    }
		    public static void main(String[] args) {
		        int number = 12; 

		        int[] factors = findFactors(number);

		        System.out.print("Factors of " + number + " are: ");
		        for (int i = 0; i < factors.length; i++) {
		            System.out.print(factors[i] + " ");
		        }
		        System.out.println();

		        int greatestFactor = findGreatestFactor(factors, number);
		        System.out.println("Greatest factor (excluding the number itself): " + greatestFactor);

		        int sum = sumOfFactors(factors);
		        System.out.println("Sum of factors: " + sum);

		        long product = productOfFactors(factors);
		        System.out.println("Product of factors: " + product);

		        double productOfCubes = productOfCubesOfFactors(factors);
		        System.out.println("Product of cubes of factors: " + productOfCubes);
		    }
		}
