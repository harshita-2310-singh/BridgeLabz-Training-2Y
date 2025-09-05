import java.util.Scanner;
public class bmi {
		    public static void calculateBMI(double[][] data) {
		        for (int i = 0; i < data.length; i++) {
		            double weight = data[i][0];
		            double heightCm = data[i][1];
		            double heightM = heightCm / 100.0; 
		            double bmi = weight / (heightM * heightM);
		            data[i][2] = bmi; 
		        }
		    }
		    public static String[] getBMIStatus(double[][] data) {
		        String[] statuses = new String[data.length];

		        for (int i = 0; i < data.length; i++) {
		            double bmi = data[i][2];

		            if (bmi <= 18.4) {
		                statuses[i] = "Underweight";
		            } else if (bmi <= 24.9) {
		                statuses[i] = "Normal";
		            } else if (bmi <= 39.9) {
		                statuses[i] = "Overweight";
		            } else {
		                statuses[i] = "Obese";
		            }
		        }

		        return statuses;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        double[][] data = new double[10][3];
		        for (int i = 0; i < data.length; i++) {
		            System.out.println("Enter details for person " + (i + 1));

		            System.out.print("Enter weight in kg: ");
		            data[i][0] = scanner.nextDouble();

		            System.out.print("Enter height in cm: ");
		            data[i][1] = scanner.nextDouble();

		            System.out.println();
		        }
		        calculateBMI(data);
		        String[] statuses = getBMIStatus(data);
		        System.out.println("Weight(kg)\tHeight(cm)\tBMI\t\tStatus");
		        for (int i = 0; i < data.length; i++) {
		            String weightStr = String.valueOf(data[i][0]);
		            String heightStr = String.valueOf(data[i][1]);
		            String bmiStr = String.valueOf(data[i][2]);
		            String status = statuses[i];

		            System.out.println(weightStr + "\t\t" + heightStr + "\t\t" + bmiStr + "\t" + status);
		        }

		        scanner.close();
		    }
		}
