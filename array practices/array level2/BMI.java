import java.util.*;
public class BMI {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter number of persons: ");
		        int numPersons = sc.nextInt();

		        
		        double[] weights = new double[numPersons];
		        double[] heights = new double[numPersons];
		        double[] bmis = new double[numPersons];
		        String[] statuses = new String[numPersons];

		       
		        for (int i = 0; i < numPersons; i++) {
		            System.out.println("\nPerson " + (i + 1) + ":");

		            System.out.print("  Enter weight (in kg): ");
		            weights[i] = sc.nextDouble();

		            System.out.print("  Enter height (in meters): ");
		            heights[i] = sc.nextDouble();

		           
		            bmis[i] = weights[i] / (heights[i] * heights[i]);

		            
		            if (bmis[i] <= 18.4) {
		                statuses[i] = "Underweight";
		            } else if (bmis[i] <= 24.9) {
		                statuses[i] = "Normal";
		            } else if (bmis[i] <= 39.9) {
		                statuses[i] = "Overweight";
		            } else {
		                statuses[i] = "Obese";
		            }
		        }

		      
		        System.out.println("\nResults:");
		        System.out.println("\n"+ "Person  "+ "  Height(m)  "+ "  Weight(kg)  "+ "  BMI  "+ "  Status  ");

		        for (int i = 0; i < numPersons; i++) {
		            System.out.println("\n"+
		                    (i + 1) + "   " +heights[i]+"  "+ weights[i]+"  "+ bmis[i]+"  "+ statuses[i]);
		        }

		      
		    }
		}


	
