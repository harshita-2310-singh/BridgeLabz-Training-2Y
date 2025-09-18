package keywords;
 class Employee {
	    private static String companyName = "Tech Solutions Ltd.";
	    private static int totalEmployees = 0;

	    private String name;
	    private final int id;
	    private String designation;

	    public Employee(String name, int id, String designation) {
	        this.name = name;
	        this.id = id;
	        this.designation = designation;
	        totalEmployees++;
	    }

	    public static void displayTotalEmployees() {
	        System.out.println("Total Employees: " + totalEmployees);
	    }

	    public void displayDetails() {
	        System.out.println("Company: " + companyName);
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee ID: " + id);
	        System.out.println("Designation: " + designation);
	    }

	    public void printIfEmployee(Object obj) {
	        if (obj instanceof Employee) {
	            ((Employee) obj).displayDetails();
	        } else {
	            System.out.println("Not a valid Employee object.");
	        }
	    }
	}

	class EmployeeManagementSystem {
	    public static void main(String[] args) {
	        Employee emp1 = new Employee("John Doe", 1001, "Software Engineer");
	        Employee emp2 = new Employee("Jane Smith", 1002, "Project Manager");

	        emp1.printIfEmployee(emp1);
	        System.out.println();
	        emp2.printIfEmployee(emp2);

	        System.out.println();
	        Employee.displayTotalEmployees();
	    }
	}

