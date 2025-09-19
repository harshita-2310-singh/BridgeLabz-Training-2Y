package objectmodeling;

public class UniversitySystem {
	    public static void main(String[] args) {
	        Professor prof1 = new Professor("Dr. Smith");
	        Professor prof2 = new Professor("Dr. Johnson");

	        Subject s1 = new Subject("Mathematics");
	        Subject s2 = new Subject("Physics");

	        prof1.assignSubject(s1);
	        prof2.assignSubject(s2);

	        Learner l1 = new Learner("Alice");
	        Learner l2 = new Learner("Bob");

	        l1.enrollSubject(s1);
	        l1.enrollSubject(s2);

	        l2.enrollSubject(s2);

	        s1.showSubjectDetails();
	        s2.showSubjectDetails();

	        l1.showEnrolledSubjects();
	        l2.showEnrolledSubjects();
	    }
	}

	class Learner {
	    String name;
	    Subject[] subjects = new Subject[10];
	    int subjectCount = 0;

	    Learner(String name) {
	        this.name = name;
	    }

	    void enrollSubject(Subject subject) {
	        if (subjectCount < subjects.length) {
	            subjects[subjectCount++] = subject;
	            subject.addLearner(this);
	            System.out.println(name + " enrolled in " + subject.title);
	        }
	    }

	    void showEnrolledSubjects() {
	        System.out.println(name + " is enrolled in:");
	        for (int i = 0; i < subjectCount; i++) {
	            System.out.println(" - " + subjects[i].title);
	        }
	        System.out.println();
	    }
	}

	class Professor {
	    String name;
	    Subject[] subjects = new Subject[10];
	    int subjectCount = 0;

	    Professor(String name) {
	        this.name = name;
	    }

	    void assignSubject(Subject subject) {
	        if (subjectCount < subjects.length) {
	            subjects[subjectCount++] = subject;
	            subject.setProfessor(this);
	            System.out.println(name + " assigned to teach " + subject.title);
	        }
	    }
	}

	class Subject {
	    String title;
	    Professor professor;
	    Learner[] learners = new Learner[20];
	    int learnerCount = 0;

	    Subject(String title) {
	        this.title = title;
	    }

	    void setProfessor(Professor prof) {
	        this.professor = prof;
	    }

	    void addLearner(Learner learner) {
	        if (learnerCount < learners.length) {
	            learners[learnerCount++] = learner;
	        }
	    }

	    void showSubjectDetails() {
	        System.out.println("Subject: " + title);
	        if (professor != null) {
	            System.out.println(" Professor: " + professor.name);
	        } else {
	            System.out.println(" Professor: Not assigned");
	        }
	        System.out.println(" Enrolled Learners:");
	        for (int i = 0; i < learnerCount; i++) {
	            System.out.println("  - " + learners[i].name);
	        }
	        System.out.println();
	    }
	}
