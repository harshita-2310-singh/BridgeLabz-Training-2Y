import java.util.*;
public class analysis {

	public static void main(String[] args) {
		        
		        Scanner sc = new Scanner(System.in);

		        
		        int[] numbers = new int[5];

		        
		        System.out.println("Enter 5 integers:");
		        for (int i = 0; i < numbers.length; i++) {
		            System.out.print("Enter number " + (i + 1) + ": ");
		            numbers[i] = sc.nextInt();
		        }

		      
		        System.out.println("\nNumber Analysis:");
		        for (int i = 0; i < numbers.length; i++) {
		            int num = numbers[i];

		            if (num > 0) {
		                if (num % 2 == 0) {
		                    System.out.println("Number at index " + i + " (" + num + ") is Positive and Even.");
		                } else {
		                    System.out.println("Number at index " + i + " (" + num + ") is Positive and Odd.");
		                }
		            } else if (num < 0) {
		                System.out.println("Number at index " + i + " (" + num + ") is Negative.");
		            } else {
		                System.out.println("Number at index " + i + " (" + num + ") is Zero.");
		            }
		        }

		        
		        int first = numbers[0];
		        int last = numbers[numbers.length - 1];

		        System.out.println("\nComparison of First and Last Elements:");
		        if (first > last) {
		            System.out.println("First element (" + first + ") is greater than Last element (" + last + ").");
		        } else if (first < last) {
		            System.out.println("First element (" + first + ") is less than Last element (" + last + ").");
		        } else {
		            System.out.println("First element (" + first + ") is equal to Last element (" + last + ").");
		        }

		        
		 
		    }
		


	}


