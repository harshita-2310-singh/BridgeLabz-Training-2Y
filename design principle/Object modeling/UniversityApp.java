package objectmodeling;

public class UniversityApp {
	    public static void main(String[] args) {
	        University uni = new University("Tech University");

	        Faculty f1 = new Faculty("Dr. Smith");
	        Faculty f2 = new Faculty("Prof. Johnson");

	        uni.addFaculty(f1);
	        uni.addFaculty(f2);

	        uni.addDepartment("Computer Science");
	        uni.addDepartment("Mechanical Engineering");

	        uni.showUniversityStructure();

	        uni = null; 
	        System.gc(); 
	    }
	}

	class University {
	    String name;
	    Department[] departments = new Department[5];
	    Faculty[] faculties = new Faculty[10];
	    int deptCount = 0;
	    int facultyCount = 0;

	    University(String name) {
	        this.name = name;
	    }

	    void addDepartment(String deptName) {
	        if (deptCount < departments.length) {
	            departments[deptCount++] = new Department(deptName);
	        }
	    }

	    void addFaculty(Faculty f) {
	        if (facultyCount < faculties.length) {
	            faculties[facultyCount++] = f;
	            System.out.println(f.name + " is added to " + name);
	        }
	    }

	    void showUniversityStructure() {
	        System.out.println("University: " + name);
	        System.out.println("Departments:");
	        for (int i = 0; i < deptCount; i++) {
	            System.out.println(" - " + departments[i].deptName);
	        }
	        System.out.println("Faculties:");
	        for (int i = 0; i < facultyCount; i++) {
	            System.out.println(" - " + faculties[i].name);
	        }
	    }

	    class Department {
	        String deptName;

	        Department(String deptName) {
	            this.deptName = deptName;
	        }
	    }
	}

	class Faculty {
	    String name;

	    Faculty(String name) {
	        this.name = name;
	    }
	}

