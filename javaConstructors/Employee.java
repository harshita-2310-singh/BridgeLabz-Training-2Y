package constructorslevel1;

public class Employee {
	    public String employeeID;
	    protected String department;
	    private double salary;

	    Employee(String employeeID, String department, double salary) {
	        this.employeeID = employeeID;
	        this.department = department;
	        this.salary = salary;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    void displayEmployeeDetails() {
	        System.out.println("Employee ID: " + employeeID);
	        System.out.println("Department: " + department);
	        System.out.println("Salary: " + salary);
	        System.out.println();
	    }
	}

	class Manager extends Employee {
	    String managerLevel;

	    Manager(String employeeID, String department, double salary, String managerLevel) {
	        super(employeeID, department, salary);
	        this.managerLevel = managerLevel;
	    }

	    void displayManagerDetails() {
	        System.out.println("Manager ID: " + employeeID);   // public → accessible
	        System.out.println("Department: " + department);   // protected → accessible in subclass
	        System.out.println("Salary: " + getSalary());      // private → accessed via getter
	        System.out.println("Manager Level: " + managerLevel);
	        System.out.println();
	    }
	}

	class EmployeeDemo {
	    public static void main(String[] args) {
	        Employee e1 = new Employee("E101", "IT", 50000);
	        e1.displayEmployeeDetails();

	        e1.setSalary(55000);
	        e1.displayEmployeeDetails();

	        Manager m1 = new Manager("M201", "HR", 75000, "Senior");
	        m1.displayManagerDetails();
	    }
	}
