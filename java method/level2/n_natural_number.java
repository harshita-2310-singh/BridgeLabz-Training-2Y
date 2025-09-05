import java.util.Scanner;
public class n_natural_number {
		    public static int recursiveSum(int n) {
		        if (n == 1) {
		            return 1; 
		        }
		        return n + recursiveSum(n - 1);
		    }
		    public static int formulaSum(int n) {
		        return n * (n + 1) / 2;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a natural number (positive integer): ");
		        int n = scanner.nextInt();

		        if (n <= 0) {
		            System.out.println("Input is not a natural number. Please enter a positive integer.");
		        } else {
		            int sumRec = recursiveSum(n);
		            int sumForm = formulaSum(n);

		            System.out.println("Sum of first " + n + " natural numbers (recursive): " + sumRec);
		            System.out.println("Sum of first " + n + " natural numbers (formula): " + sumForm);

		            if (sumRec == sumForm) {
		                System.out.println("Both methods produce the same result. Computation is correct!");
		            } else {
		                System.out.println("There is a discrepancy between the two methods.");
		            }
		        }

		        scanner.close();
		    }
		}
