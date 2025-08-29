import java.util.*;
public class multiple_values {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		       
		        double[] numbers = new double[10];

		        
		        double total = 0.0;
		        int index = 0;

		        
		        while (true) {
		            System.out.print("Enter a number (0 or negative to stop): ");
		            double input = sc.nextDouble();

		          
		            if (input <= 0) {
		                break;
		            }

		           
		            if (index == 10) {
		                System.out.println("Maximum of 10 numbers reached.");
		                break;
		            }

		           
		            numbers[index] = input;
		            index++;
		        }

		        for (int i = 0; i < index; i++) {
		            total += numbers[i];
		        }

		       
		        System.out.println("\nStored numbers:");
		        for (int i = 0; i < index; i++) {
		            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
		        }
		        System.out.println("\nTotal of all numbers: " + total);

		        
		    
		


	}

}
