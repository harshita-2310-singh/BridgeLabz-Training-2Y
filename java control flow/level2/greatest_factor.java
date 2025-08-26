import java.util.*;
public class greatest_factor {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int n = sc.nextInt();
		        if (n <= 0) {
		            System.out.println("Please enter a positive integer!");
		        } else {
		            int greatestFactor = 1;
		            for (int i = n- 1; i >= 1; i--) {
		                if (n % i == 0) {
		                    greatestFactor = i;
		                    break; 
		                }
		            }

		            System.out.println("The greatest factor of " + n + " besides itself is: " + greatestFactor);
		        }

		        
		    }
		

	

}
