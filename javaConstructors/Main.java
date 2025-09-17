package constructorslevel1;
	class Student {
	    public int rollNumber;
	    protected String name;
	    private double CGPA;

	    Student(int rollNumber, String name, double CGPA) {
	        this.rollNumber = rollNumber;
	        this.name = name;
	        this.CGPA = CGPA;
	    }

	    public double getCGPA() {
	        return CGPA;
	    }

	    public void setCGPA(double CGPA) {
	        this.CGPA = CGPA;
	    }

	    public void display() {
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Name: " + name);
	        System.out.println("CGPA: " + CGPA);
	        System.out.println();
	    }
	}

	class PostgraduateStudent extends Student {
	    String specialization;

	    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
	        super(rollNumber, name, CGPA);
	        this.specialization = specialization;
	    }

	    public void displayPGDetails() {
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Name: " + name);
	        System.out.println("Specialization: " + specialization);
	        System.out.println("CGPA: " + getCGPA());
	        System.out.println();
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Student s1 = new Student(101, "Amit", 8.5);
	        s1.display();

	        s1.setCGPA(9.0);
	        s1.display();

	        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Riya", 9.2, "Computer Science");
	        pg1.displayPGDetails();
	    }
	}