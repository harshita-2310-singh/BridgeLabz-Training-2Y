import java.util.*;
public class bmi {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        int numberOfPeople = 10;

		        
		        double[][] heightWeight = new double[numberOfPeople][2];

		        System.out.println("Enter weight (kg) and height (cm) for 10 people:");
		        for (int i = 0; i < numberOfPeople; i++) {
		            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
		            heightWeight[i][0] = scanner.nextDouble();

		            System.out.print("Person " + (i + 1) + " - Height (cm): ");
		            heightWeight[i][1] = scanner.nextDouble();
		        }

		       
		        String[][] bmiData = getBMIData(heightWeight);

		       
		        displayBMIData(bmiData);

		        scanner.close();
		    }


		    public static String[][] computeBMIAndStatus(double[][] heightWeight) {
		        String[][] bmiStatus = new String[heightWeight.length][2];

		        for (int i = 0; i < heightWeight.length; i++) {
		            double weight = heightWeight[i][0];
		            double heightCm = heightWeight[i][1];
		            double heightM = heightCm / 100.0;

		            double bmi = weight / (heightM * heightM);
		            bmi = Math.round(bmi * 100.0) / 100.0; 

		            String status;

		            if (bmi <= 18.4) {
		                status = "Underweight";
		            } else if (bmi <= 24.9) {
		                status = "Normal";
		            } else if (bmi <= 39.9) {
		                status = "Overweight";
		            } else {
		                status = "Obese";
		            }

		            bmiStatus[i][0] = String.valueOf(bmi);
		            bmiStatus[i][1] = status;
		        }

		        return bmiStatus;
		    }
		    public static String[][] getBMIData(double[][] heightWeight) {
		        String[][] bmiStatus = computeBMIAndStatus(heightWeight);
		        String[][] result = new String[heightWeight.length][4];

		        for (int i = 0; i < heightWeight.length; i++) {
		            result[i][0] = String.valueOf(heightWeight[i][1]);
		            result[i][1] = String.valueOf(heightWeight[i][0]);
		            result[i][2] = bmiStatus[i][0];                    
		            result[i][3] = bmiStatus[i][1];                    
		        }

		        return result;
		    }

		 
		    public static void displayBMIData(String[][] bmiData) {
		        System.out.println("\n--- BMI Report ---");
		        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
		        System.out.println("-------------------------------------------------------------");

		        for (int i = 0; i < bmiData.length; i++) {
		            System.out.println((i + 1) + "\t" +
		                bmiData[i][0] + "\t\t" +
		                bmiData[i][1] + "\t\t" +
		                bmiData[i][2] + "\t\t" +
		                bmiData[i][3]);
		        }
		    }
		}



