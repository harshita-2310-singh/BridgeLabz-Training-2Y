package objectmodeling;

public class CompanyApp {
	    public static void main(String[] args) {
	        Company myCompany = new Company("TechCorp");

	        myCompany.addDepartment("HR", new String[]{"Alice", "Bob"});
	        myCompany.addDepartment("IT", new String[]{"Charlie", "David", "Eve"});

	        myCompany.showCompanyStructure();

	        myCompany = null; 

	        System.gc(); 
	    }
	}

	class Company {
	    String name;
	    Department[] departments = new Department[5];
	    int deptCount = 0;

	    Company(String name) {
	        this.name = name;
	    }

	    void addDepartment(String deptName, String[] employeeNames) {
	        if (deptCount < departments.length) {
	            departments[deptCount++] = new Department(deptName, employeeNames);
	        }
	    }

	    void showCompanyStructure() {
	        System.out.println("Company: " + name);
	        for (int i = 0; i < deptCount; i++) {
	            departments[i].showDepartment();
	        }
	    }

	    class Department {
	        String deptName;
	        Employee[] employees;

	        Department(String deptName, String[] employeeNames) {
	            this.deptName = deptName;
	            employees = new Employee[employeeNames.length];
	            for (int i = 0; i < employeeNames.length; i++) {
	                employees[i] = new Employee(employeeNames[i]);
	            }
	        }

	        void showDepartment() {
	            System.out.println(" Department: " + deptName);
	            for (Employee e : employees) {
	                System.out.println("  - " + e.name);
	            }
	        }

	        class Employee {
	            String name;

	            Employee(String name) {
	                this.name = name;
	            }
	        }
	    }
	}
