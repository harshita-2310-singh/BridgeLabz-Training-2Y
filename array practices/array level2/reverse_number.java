import java.util.*;
public class reverse_number {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		  
		        System.out.print("Enter a positive integer: ");
		        int number = sc.nextInt();

		        if (number < 0) {
		            System.out.println("Invalid input! Please enter a positive number.");
		            return;
		        }

		        
		        int temp = number;
		        int count = 0;
		        while (temp > 0) {
		            temp /= 10;
		            count++;
		        }

		      
		        if (number == 0) {
		            System.out.println("Reversed number: 0");
		            return;
		        }
		        int[] digits = new int[count];
		        temp = number;
		        for (int i = count - 1; i >= 0; i--) {
		            digits[i] = temp % 10;
		            temp /= 10;
		        }
		        int[] reversedDigits = new int[count];
		        for (int i = 0; i < count; i++) {
		            reversedDigits[i] = digits[count - 1 - i];
		        }

		        System.out.print("Reversed number: ");
		        for (int i = 0; i < reversedDigits.length; i++) {
		            System.out.print(reversedDigits[i]);
		        }

		        System.out.println();
		       
		    }
		}


	
