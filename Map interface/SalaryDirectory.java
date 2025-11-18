import java.util.*;

public class SalaryDirectory {
    public static void main(String[] args) {
        Map<String, Double> salaries = new HashMap<>();

        salaries.put("Alice", 50000.0);
        salaries.put("Bob", 45000.0);
        salaries.put("Carol", 60000.0);
        salaries.put("David", 55000.0);
        salaries.put("Eva", 48000.0);
        salaries.put("Frank", 70000.0);

        giveRaise(salaries, "Alice", 10);
        giveRaise(salaries, "Bob", 5);
        giveRaise(salaries, "Frank", 8);
        giveRaise(salaries, "Zara", 12);

        System.out.println("Salaries:");
        for (Map.Entry<String, Double> e : salaries.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        double avg = calculateAverage(salaries);
        System.out.println("Average Salary: " + avg);

        printHighestPaid(salaries);
    }

    static void giveRaise(Map<String, Double> map, String name, double percent) {
        if (!map.containsKey(name)) {
            System.out.println("Employee not found");
            return;
        }
        double updated = map.get(name) + map.get(name) * percent / 100.0;
        map.put(name, updated);
    }

    static double calculateAverage(Map<String, Double> map) {
        double sum = 0;
        for (double s : map.values()) sum += s;
        return sum / map.size();
    }

    static void printHighestPaid(Map<String, Double> map) {
        double max = Collections.max(map.values());
        System.out.println("Highest Paid Employee(s):");
        for (Map.Entry<String, Double> e : map.entrySet()) {
            if (e.getValue() == max) System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}
