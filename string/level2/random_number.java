import java.util.Random;
import java.util.Scanner;

public class random_number {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter the number of students:");
		        int numberOfStudents = scanner.nextInt();
		        int[] ages = generateRandomAges(numberOfStudents);
		        String[][] eligibility = checkVotingEligibility(ages);
		        displayEligibilityTable(eligibility);

		        scanner.close();
		    }

		  
		    public static int[] generateRandomAges(int n) {
		        int[] ages = new int[n];
		        Random rand = new Random();

		        for (int i = 0; i < n; i++) {
		           
		            ages[i] = rand.nextInt(90) + 10;
		        }

		        return ages;
		    }

		 
		    public static String[][] checkVotingEligibility(int[] ages) {
		        String[][] result = new String[ages.length][2];

		        for (int i = 0; i < ages.length; i++) {
		            int age = ages[i];
		            result[i][0] = String.valueOf(age);

		            if (age < 0) {
		                result[i][1] = "false";
		            } else if (age >= 18) {
		                result[i][1] = "true"; 
		            } else {
		                result[i][1] = "false"; 
		            }
		        }

		        return result;
		    }

		   
		    public static void displayEligibilityTable(String[][] data) {
		        System.out.println("\nStudent\tAge\tCan Vote?");
		        System.out.println("-----------------------------");

		        for (int i = 0; i < data.length; i++) {
		            System.out.println("  " + (i + 1) + "\t " + data[i][0] + "\t  " + data[i][1]);
		        }
		    }
		}


	
