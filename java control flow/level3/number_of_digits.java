import java.util.*;
public class number_of_digits {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        
		        int number = scanner.nextInt();

		        int count = 0;                  
		        int originalNumber = number;   

		       
		        if (number == 0) {
		            count = 1;
		        } else {
		          
		            while (number != 0) {
		                number = number / 10;  
		                count++;               
		            }
		        }

		        System.out.println("Number of digits in " + originalNumber + " is: " + count);
		    }
		


	}


