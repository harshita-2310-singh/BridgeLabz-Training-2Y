import java.util.*;

public class ExamResults {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> data = new HashMap<>();

        data.put("Math", new HashMap<>());
        data.put("Science", new HashMap<>());
        data.put("English", new HashMap<>());

        data.get("Math").put("Alice", 88);
        data.get("Math").put("Bob", 92);
        data.get("Math").put("Carol", 76);

        data.get("Science").put("Alice", 91);
        data.get("Science").put("David", 85);

        data.get("English").put("Eva", 95);
        data.get("English").put("Frank", 67);

        for (String subject : data.keySet()) {
            Map<String, Integer> m = data.get(subject);
            int max = Collections.max(m.values());
            for (Map.Entry<String, Integer> e : m.entrySet())
                if (e.getValue() == max)
                    System.out.println("Topper in " + subject + ": " + e.getKey() + " = " + e.getValue());
        }

        for (String subject : data.keySet()) {
            Map<String, Integer> m = data.get(subject);
            double avg = m.values().stream().mapToInt(a -> a).average().orElse(0);
            System.out.println("Average in " + subject + ": " + avg);
        }

        System.out.println("Subjects with score > 90:");
        for (String subject : data.keySet()) {
            boolean ok = false;
            for (int score : data.get(subject).values()) {
                if (score > 90) {
                    ok = true;
                    break;
                }
            }
            if (ok) System.out.println(subject);
        }
    }
}
