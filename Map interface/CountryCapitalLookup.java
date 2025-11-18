import java.util.*;

public class CountryCapitalLookup {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        countries.put("India", "New Delhi");
        countries.put("USA", "Washington D.C.");
        countries.put("Japan", "Tokyo");
        countries.put("Germany", "Berlin");
        countries.put("France", "Paris");
        countries.put("China", "Beijing");
        countries.put("Canada", "Ottawa");
        countries.put("Australia", "Canberra");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (countries.containsKey(input))
            System.out.println("Capital: " + countries.get(input));
        else
            System.out.println("Unknown country");

        System.out.println("All Countries:");
        TreeMap<String, String> sorted = new TreeMap<>(countries);
        for (Map.Entry<String, String> e : sorted.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
