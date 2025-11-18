import java.util.*;

public class CourseRegistration {
    public static void main(String[] args) {
        Map<String, Integer> courses = new HashMap<>();

        courses.put("CS101", 45);
        courses.put("CS102", 3);
        courses.put("CS201", 52);
        courses.put("MA101", 10);
        courses.put("PH101", 1);

        addStudents(courses, "CS101", 10);
        dropStudents(courses, "MA101", 5);
        addStudents(courses, "PH101", 3);
        dropStudents(courses, "CS102", 1);
        addStudents(courses, "CS201", 5);

        System.out.println("Course Registrations:");
        for (Map.Entry<String, Integer> e : courses.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        System.out.println("Near Full (>=50):");
        for (Map.Entry<String, Integer> e : courses.entrySet()) {
            if (e.getValue() >= 50) System.out.println(e.getKey());
        }

        System.out.println("Under-subscribed (<5):");
        for (Map.Entry<String, Integer> e : courses.entrySet()) {
            if (e.getValue() < 5) System.out.println(e.getKey());
        }
    }

    static void addStudents(Map<String, Integer> map, String course, int count) {
        map.put(course, map.getOrDefault(course, 0) + count);
    }

    static void dropStudents(Map<String, Integer> map, String course, int count) {
        if (!map.containsKey(course)) return;
        int newCount = map.get(course) - count;
        if (newCount < 0) newCount = 0;
        map.put(course, newCount);
    }
}
