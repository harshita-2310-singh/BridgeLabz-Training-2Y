import college.student.Student;
import college.faculty.Faculty;

public class mainapp {
    public static void main(String[] args) {
        Student s = new Student("Alice", 101);
        Faculty f = new Faculty("Dr. Smith", "Mathematics");

        s.displayStudentInfo();
        f.displayFacultyInfo();
    }
}
