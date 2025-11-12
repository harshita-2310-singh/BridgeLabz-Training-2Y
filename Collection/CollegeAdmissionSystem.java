import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;
    String id;

    Student(String id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return id.equals(s.id);
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public int compareTo(Student s) {
        return Integer.compare(s.marks, this.marks); // Sort by marks (descending)
    }

    public String toString() {
        return name + " (" + id + ") - Marks: " + marks;
    }
}

public class CollegeAdmissionSystem {
    public static void main(String[] args) {
        List<Student> applicants = new ArrayList<>(Arrays.asList(
            new Student("S1", "Alice", 85),
            new Student("S2", "Bob", 72),
            new Student("S3", "Charlie", 91),
            new Student("S4", "David", 67),
            new Student("S5", "Eva", 95)
        ));

        Set<Student> shortlisted = new HashSet<>();
        for (Student s : applicants) {
            if (s.marks >= 70) shortlisted.add(s);
        }

        Queue<Student> interviewQueue = new LinkedList<>(shortlisted);
        TreeSet<Student> meritList = new TreeSet<>();

        System.out.println("Interview Queue:");
        for (Student s : interviewQueue) System.out.println(s);

        System.out.println("\nConducting Interviews...");
        while (!interviewQueue.isEmpty()) {
            Student s = interviewQueue.poll();
            if (s.marks >= 80) meritList.add(s);
        }

        System.out.println("\nFinal Merit List (Sorted by Marks):");
        for (Student s : meritList) System.out.println(s);
    }
}
