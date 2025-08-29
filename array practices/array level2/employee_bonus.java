import java.util.*;
public class employee_bonus {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        int employeeCount = 10;
		        double[] salaries = new double[employeeCount];
		        double[] yearsOfService = new double[employeeCount];
		        double[] bonuses = new double[employeeCount];
		        double[] newSalaries = new double[employeeCount];

		        double totalBonus = 0.0;
		        double totalOldSalary = 0.0;
		        double totalNewSalary = 0.0;
		        for (int i = 0; i < employeeCount; i++) {
		            System.out.println("Enter details for employee " + (i + 1) + ":");

		         
		            while (true) {
		                System.out.print("Salary: ");
		                double salaryInput = sc.nextDouble();
		                if (salaryInput <= 0) {
		                    System.out.println("Invalid salary! Please enter a positive number.");
		                } else {
		                    salaries[i] = salaryInput;
		                    break;
		                }
		            }
		            while (true) {
		                System.out.print("Years of Service: ");
		                double yosInput = sc.nextDouble();
		                if (yosInput < 0) {
		                    System.out.println("Invalid years of service! Please enter zero or a positive number.");
		                } else {
		                    yearsOfService[i] = yosInput;
		                    break;
		                }
		            }
		            System.out.println();
		        }
		        for (int i = 0; i < employeeCount; i++) {
		            if (yearsOfService[i] > 5) {
		                bonuses[i] = salaries[i] * 0.05; 
		            } else {
		                bonuses[i] = salaries[i] * 0.02; 
		            }

		            newSalaries[i] = salaries[i] + bonuses[i];

		            totalBonus += bonuses[i];
		            totalOldSalary += salaries[i];
		            totalNewSalary += newSalaries[i];
		        }

		       
		        System.out.println("Employee Bonus and Salary Details:");
		        System.out.println( "Employee "+"  Old Salary "+"  Bonus "+"  New Salary");
		        for (int i = 0; i < employeeCount; i++) {
		            System.out.println("   "+(i + 1)+"   "+ salaries[i]+"   "+bonuses[i]+"   "+ newSalaries[i]);
		        }
		        System.out.println("------------------------------------------------");
		        System.out.println("Total Old Salary: "+totalOldSalary);
		        System.out.println("Total Bonus Paid:" + totalBonus);
		        System.out.println("Total New Salary: "+ totalNewSalary);

		      
		    
		


	}

}
