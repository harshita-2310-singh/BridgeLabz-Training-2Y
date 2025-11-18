import java.util.*;

public class AttendanceTracker {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Alice", "Bob", "Carol", "David", "Eva");
        Map<String, Integer> attendance = new HashMap<>();

        for (String s : students) attendance.put(s, 0);

        List<List<String>> dailyPresent = Arrays.asList(
                Arrays.asList("Alice", "Bob"),
                Arrays.asList("Alice", "Carol", "Eva"),
                Arrays.asList("Bob", "David"),
                Arrays.asList("Alice", "Eva"),
                Arrays.asList("Carol"),
                Arrays.asList("Alice", "Bob", "David"),
                Arrays.asList("Eva"),
                Arrays.asList("Alice", "Carol"),
                Arrays.asList("Bob"),
                Arrays.asList("Alice", "Bob", "David"),
                Arrays.asList("Eva"),
                Arrays.asList("Alice", "Carol", "Eva"),
                Arrays.asList("Carol"),
                Arrays.asList("David", "Bob"),
                Arrays.asList("Alice")
        );

        for (List<String> presentToday : dailyPresent) {
            for (String p : presentToday) {
                attendance.put(p, attendance.get(p) + 1);
            }
        }

        System.out.println("Attendance Count:");
        for (Map.Entry<String, Integer> e : attendance.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        System.out.println("Under-attending (<10):");
        for (Map.Entry<String, Integer> e : attendance.entrySet()) {
            if (e.getValue() < 10) System.out.println(e.getKey());
        }
    }
}
