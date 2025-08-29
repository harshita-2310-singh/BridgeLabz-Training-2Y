import java.util.*;
public class factors {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a positive number to find its factors: ");
		        int number = sc.nextInt();

		        if (number <= 0) {
		            System.out.println("Invalid input! Please enter a natural number greater than 0.");
		            return;
		        }

		       
		        int maxFactor = 10;                   
		        int[] factors = new int[maxFactor];     
		        int index = 0;                          

		      
		        for (int i = 1; i <= number; i++) {
		            if (number % i == 0) {
		              
		                if (index == maxFactor) {
		                    maxFactor *= 2;  
		                    int[] temp = new int[maxFactor];

		                    
		                    for (int j = 0; j < index; j++) {
		                        temp[j] = factors[j];
		                    }
		                    factors = temp;
		                }

		         
		                factors[index] = i;
		                index++;
		            }
		        }
		        System.out.println("\nFactors of " + number + ":");
		        for (int i = 0; i < index; i++) {
		            System.out.print(factors[i] + " ");
		        }

		        System.out.println();
		    }
		}


	
