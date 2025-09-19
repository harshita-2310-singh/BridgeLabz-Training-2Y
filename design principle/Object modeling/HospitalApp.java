package objectmodeling;

public class HospitalApp {
	    public static void main(String[] args) {
	        Hospital hospital = new Hospital("City Hospital");

	        Doctor d1 = new Doctor("Dr. Smith");
	        Doctor d2 = new Doctor("Dr. Patel");

	        Patient p1 = new Patient("Alice");
	        Patient p2 = new Patient("Bob");

	        hospital.addDoctor(d1);
	        hospital.addDoctor(d2);

	        hospital.addPatient(p1);
	        hospital.addPatient(p2);

	        d1.consult(p1);
	        d1.consult(p2);

	        d2.consult(p2);

	        p1.viewDoctors();
	        p2.viewDoctors();

	        d1.viewPatients();
	        d2.viewPatients();
	    }
	}

	class Hospital {
	    String name;
	    Doctor[] doctors = new Doctor[10];
	    Patient[] patients = new Patient[10];
	    int doctorCount = 0;
	    int patientCount = 0;

	    Hospital(String name) {
	        this.name = name;
	    }

	    void addDoctor(Doctor d) {
	        if (doctorCount < doctors.length) {
	            doctors[doctorCount++] = d;
	            System.out.println(d.name + " added to " + name);
	        }
	    }

	    void addPatient(Patient p) {
	        if (patientCount < patients.length) {
	            patients[patientCount++] = p;
	            System.out.println(p.name + " registered at " + name);
	        }
	    }
	}

	class Doctor {
	    String name;
	    Patient[] patients = new Patient[10];
	    int patientCount = 0;

	    Doctor(String name) {
	        this.name = name;
	    }

	    void consult(Patient p) {
	        if (patientCount < patients.length) {
	            patients[patientCount++] = p;
	            p.addDoctor(this); // two-way association
	            System.out.println(name + " is consulting " + p.name);
	        }
	    }

	    void viewPatients() {
	        System.out.println(name + "'s Patients:");
	        for (int i = 0; i < patientCount; i++) {
	            System.out.println(" - " + patients[i].name);
	        }
	        System.out.println();
	    }
	}

	class Patient {
	    String name;
	    Doctor[] doctors = new Doctor[10];
	    int doctorCount = 0;

	    Patient(String name) {
	        this.name = name;
	    }

	    void addDoctor(Doctor d) {
	        if (doctorCount < doctors.length) {
	            doctors[doctorCount++] = d;
	        }
	    }

	    void viewDoctors() {
	        System.out.println(name + " has consulted:");
	        for (int i = 0; i < doctorCount; i++) {
	            System.out.println(" - " + doctors[i].name);
	        }
	        System.out.println();
	    }
	}