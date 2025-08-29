import java.util.*;
public class number_analysis_updated {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // Step 1: Take user input
		        System.out.print("Enter a positive integer: ");
		        long number = sc.nextLong();

		        if (number <= 0) {
		            System.out.println("Invalid input! Please enter a positive number.");
		            return;
		        }

		      
		        int maxDigit = 10;
		        int[] digits = new int[maxDigit];
		        int index = 0;

		        
		        while (number != 0) {
		            if (index == maxDigit) {
		               
		                maxDigit += 10;
		                int[] temp = new int[maxDigit];

		                
		                for (int i = 0; i < digits.length; i++) {
		                    temp[i] = digits[i];
		                }

		                digits = temp; 
		            }

		            digits[index] = (int)(number % 10);
		            number /= 10; 
		            index++;
		        }

		        
		        int largest = -1;
		        int secondLargest = -1;

		        for (int i = 0; i < index; i++) {
		            int digit = digits[i];

		            if (digit > largest) {
		                secondLargest = largest;
		                largest = digit;
		            } else if (digit > secondLargest && digit != largest) {
		                secondLargest = digit;
		            }
		        }

		      
		        System.out.print("\nDigits in the number: ");
		        for (int i = 0; i < index; i++) {
		            System.out.print(digits[i] + " ");
		        }

		        System.out.println("\nLargest digit: " + largest);

		        if (secondLargest != -1) {
		            System.out.println("Second largest digit: " + secondLargest);
		        } else {
		            System.out.println("No second largest digit found (all digits may be the same).");
		        }

		      
		    }
		}



