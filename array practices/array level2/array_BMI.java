import java.util.*;
public class array_BMI {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		       
		        System.out.print("Enter number of persons: ");
		        int number = sc.nextInt();

		        
		        double[][] personData = new double[number][3]; 
		        String[] weightStatus = new String[number];

		       
		        for (int i = 0; i < number; i++) {
		            System.out.println("\nPerson " + (i + 1) + ":");

		            
		            double height;
		            do {
		                System.out.print("  Enter height (in meters): ");
		                height = sc.nextDouble();
		                if (height <= 0) {
		                    System.out.println("  Height must be positive. Try again.");
		                }
		            } while (height <= 0);

		           
		            double weight;
		            do {
		                System.out.print("  Enter weight (in kg): ");
		                weight = sc.nextDouble();
		                if (weight <= 0) {
		                    System.out.println("  Weight must be positive. Try again.");
		                }
		            } while (weight <= 0);

		            
		            personData[i][0] = height;
		            personData[i][1] = weight;

		           
		            double bmi = weight / (height * height);
		            personData[i][2] = bmi;

		           
		            if (bmi <= 18.4) {
		                weightStatus[i] = "Underweight";
		            } else if (bmi <= 24.9) {
		                weightStatus[i] = "Normal";
		            } else if (bmi <= 39.9) {
		                weightStatus[i] = "Overweight";
		            } else {
		                weightStatus[i] = "Obese";
		            }
		        }

		       
		        System.out.println("\nResults:");
		        System.out.println("\n"+ "  Person  "+ "  Height(m)  "+ "  Weight(kg)  "+"  BMI  " +"  Status  ");

		        for (int i = 0; i < number; i++) {
		            System.out.println("\n"+
		                    (i + 1)+"  "+ personData[i][0]+"  "+ personData[i][1]+"      "+   personData[i][2]   +"        "+weightStatus[i]);
		        }

		      
		    }
		}


	
