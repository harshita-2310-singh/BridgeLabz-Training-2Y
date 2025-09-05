import java.util.Scanner;
public class number_of_chocolates {
		    public static int[] findRemainderAndQuotient(int number, int divisor) {
		        int remainder = number % divisor;
		        int quotient = number / divisor;
		        return new int[] {remainder, quotient};
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number of chocolates: ");
		        int numberOfChocolates = scanner.nextInt();

		        System.out.print("Enter the number of children: ");
		        int numberOfChildren = scanner.nextInt();
		        if (numberOfChildren == 0) {
		            System.out.println("Number of children cannot be zero.");
		        } else if (numberOfChocolates < 0 || numberOfChildren < 0) {
		            System.out.println("Please enter non-negative numbers.");
		        } else {
		            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

		            System.out.println("Each child will get " + result[1] + " chocolates.");
		            System.out.println("Remaining chocolates: " + result[0]);
		        }

		        scanner.close();
		    }
		}
