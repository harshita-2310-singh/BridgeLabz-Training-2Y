import java.util.*;

abstract class CourseType {
    private String name;
    public CourseType(String name) { this.name = name; }
    public String getName() { return name; }
    public abstract String getEvaluationMethod();
}

class ExamCourse extends CourseType {
    public ExamCourse(String name) { super(name); }
    public String getEvaluationMethod() { return "Exam-Based Evaluation"; }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String name) { super(name); }
    public String getEvaluationMethod() { return "Assignment-Based Evaluation"; }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String name) { super(name); }
    public String getEvaluationMethod() { return "Research-Based Evaluation"; }
}

class Course<T extends CourseType> {
    private T courseType;
    private String instructor;
    private int credits;

    public Course(T courseType, String instructor, int credits) {
        this.courseType = courseType;
        this.instructor = instructor;
        this.credits = credits;
    }

    public T getCourseType() { return courseType; }
    public String getInstructor() { return instructor; }
    public int getCredits() { return credits; }

    public String toString() {
        return courseType.getName() + " | " + courseType.getEvaluationMethod() + 
               " | Instructor: " + instructor + " | Credits: " + credits;
    }
}

class University {
    public static void printCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c.getName() + " - " + c.getEvaluationMethod());
        }
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Course<ExamCourse> math = new Course<>(new ExamCourse("Mathematics"), "Dr. Sharma", 4);
        Course<AssignmentCourse> english = new Course<>(new AssignmentCourse("English Literature"), "Prof. Mehta", 3);
        Course<ResearchCourse> ai = new Course<>(new ResearchCourse("AI Research"), "Dr. Verma", 5);

        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(math.getCourseType());
        allCourses.add(english.getCourseType());
        allCourses.add(ai.getCourseType());

        System.out.println("=== University Course List ===");
        University.printCourses(allCourses);

        System.out.println("\n=== Detailed Course Information ===");
        System.out.println(math);
        System.out.println(english);
        System.out.println(ai);
    }
}
