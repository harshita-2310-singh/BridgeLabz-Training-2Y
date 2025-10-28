import college.student.Student; // import from exported package

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student("Alice", 101);
        s.display();
    }
}
