import java.util.Random;
public class bonus {
	    static final int EMPLOYEE_COUNT = 10;
	    public static double[][] generateEmployeeData() {
	        double[][] data = new double[EMPLOYEE_COUNT][2]; 
	        Random rand = new Random();

	        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
	            int salary = 10000 + rand.nextInt(90000); 
	            int years = rand.nextInt(11);             
	            data[i][0] = salary;
	            data[i][1] = years;
	        }

	        return data;
	    }
	    public static double[][] calculateBonuses(double[][] data) {
	        double[][] result = new double[EMPLOYEE_COUNT][3]; 
	        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
	            double salary = data[i][0];
	            double years = data[i][1];
	            double bonus;

	            if (years > 5) {
	                bonus = salary * 0.05;
	            } else {
	                bonus = salary * 0.02;
	            }

	            double newSalary = salary + bonus;

	            result[i][0] = bonus;
	            result[i][1] = newSalary;
	            result[i][2] = years;
	        }

	        return result;
	    }
	    public static void displayResults(double[][] oldData, double[][] newData) {
	        double totalOldSalary = 0;
	        double totalBonus = 0;
	        double totalNewSalary = 0;

	        System.out.println("EmpID | Old Salary | Years | Bonus     | New Salary");
	        System.out.println("------------------------------------------------------");

	        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
	            int empId = i + 1;
	            double oldSalary = oldData[i][0];
	            double years = oldData[i][1];
	            double bonus = newData[i][0];
	            double newSalary = newData[i][1];

	            totalOldSalary += oldSalary;
	            totalBonus += bonus;
	            totalNewSalary += newSalary;

	            System.out.println(empId + "     | " + oldSalary + "  | " + (int)years + "     | " + bonus + " | " + newSalary);
	        }

	        System.out.println("------------------------------------------------------");
	        System.out.println("Total Old Salary: " + totalOldSalary);
	        System.out.println("Total Bonus: " + totalBonus);
	        System.out.println("Total New Salary: " + totalNewSalary);
	    }

	    public static void main(String[] args) {
	        double[][] employeeData = generateEmployeeData();
	        double[][] bonusData = calculateBonuses(employeeData);
	        displayResults(employeeData, bonusData);
	    }
	}
