package objectmodeling;

public class SchoolApp {
	    public static void main(String[] args) {
	        School school = new School("Greenwood High");

	        Student s1 = new Student("Alice");
	        Student s2 = new Student("Bob");

	        Course c1 = new Course("Math");
	        Course c2 = new Course("Science");
	        Course c3 = new Course("History");

	        school.addStudent(s1);
	        school.addStudent(s2);

	        s1.enroll(c1);
	        s1.enroll(c2);

	        s2.enroll(c2);
	        s2.enroll(c3);

	        s1.viewCourses();
	        s2.viewCourses();

	        c2.viewStudents();
	    }
	}

	class School {
	    String name;
	    Student[] students = new Student[10];
	    int count = 0;

	    School(String name) {
	        this.name = name;
	    }

	    void addStudent(Student s) {
	        if (count < students.length) {
	            students[count++] = s;
	            System.out.println(s.name + " added to " + name);
	        }
	    }
	}

	class Student {
	    String name;
	    Course[] courses = new Course[5];
	    int courseCount = 0;

	    Student(String name) {
	        this.name = name;
	    }

	    void enroll(Course course) {
	        if (courseCount < courses.length) {
	            courses[courseCount++] = course;
	            course.addStudent(this); // associate back
	            System.out.println(name + " enrolled in " + course.title);
	        }
	    }

	    void viewCourses() {
	        System.out.println(name + " is enrolled in:");
	        for (int i = 0; i < courseCount; i++) {
	            System.out.println(" - " + courses[i].title);
	        }
	        System.out.println();
	    }
	}

	class Course {
	    String title;
	    Student[] students = new Student[10];
	    int studentCount = 0;

	    Course(String title) {
	        this.title = title;
	    }

	    void addStudent(Student s) {
	        if (studentCount < students.length) {
	            students[studentCount++] = s;
	        }
	    }

	    void viewStudents() {
	        System.out.println("Students enrolled in " + title + ":");
	        for (int i = 0; i < studentCount; i++) {
	            System.out.println(" - " + students[i].name);
	        }
	        System.out.println();
	    }
	}
