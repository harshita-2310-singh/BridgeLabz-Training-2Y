package keywords;

public class Patient {
	    private static String hospitalName = "City Hospital";
	    private static int totalPatients = 0;

	    private String name;
	    private int age;
	    private String ailment;
	    private final String patientID;

	    public Patient(String name, int age, String ailment, String patientID) {
	        this.name = name;
	        this.age = age;
	        this.ailment = ailment;
	        this.patientID = patientID;
	        totalPatients++;
	    }

	    public static int getTotalPatients() {
	        return totalPatients;
	    }

	    public void displayDetails() {
	        System.out.println("Hospital: " + hospitalName);
	        System.out.println("Patient Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Ailment: " + ailment);
	        System.out.println("Patient ID: " + patientID);
	    }

	    public void displayIfPatient(Object obj) {
	        if (obj instanceof Patient) {
	            ((Patient) obj).displayDetails();
	        } else {
	            System.out.println("Invalid Patient object.");
	        }
	    }
	}

	class HospitalManagementSystem {
	    public static void main(String[] args) {
	        Patient p1 = new Patient("John Doe", 45, "Flu", "PAT1001");
	        Patient p2 = new Patient("Jane Smith", 30, "Fracture", "PAT1002");

	        p1.displayIfPatient(p1);
	        System.out.println();

	        p2.displayIfPatient(p2);
	        System.out.println();

	        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
	    }
	}