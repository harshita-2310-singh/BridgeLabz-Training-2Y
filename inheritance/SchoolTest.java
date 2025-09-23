class PersonBase {
    String name;
    int age;

    PersonBase(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class TeacherEx extends PersonBase {
    String subject;

    TeacherEx(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }

    void displayRole() {
        System.out.println("Role: Teacher");
    }
}

class StudentEx extends PersonBase {
    String grade;

    StudentEx(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }

    void displayRole() {
        System.out.println("Role: Student");
    }
}

class StaffEx extends PersonBase {
    String department;

    StaffEx(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }

    void displayRole() {
        System.out.println("Role: Staff");
    }
}

public class SchoolTest {
    public static void main(String[] args) {
        TeacherEx t = new TeacherEx("Alice", 35, "Mathematics");
        StudentEx s = new StudentEx("Bob", 16, "10th Grade");
        StaffEx st = new StaffEx("Charlie", 40, "Administration");

        t.displayRole();
        t.displayDetails();
        System.out.println();

        s.displayRole();
        s.displayDetails();
        System.out.println();

        st.displayRole();
        st.displayDetails();
    }
}
