import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {

        Map<String, Double> accounts = new HashMap<>();

        accounts.put("AC101", 50000.0);
        accounts.put("AC102", 25000.0);
        accounts.put("AC103", 75000.0);
        accounts.put("AC104", 15000.0);
        accounts.put("AC105", 90000.0);

        deposit(accounts, "AC102", 5000);
        withdraw(accounts, "AC104", 3000);
        withdraw(accounts, "AC101", 60000);

        System.out.println("\nAll Accounts (Descending by Balance):");
        printSorted(accounts);

        System.out.println("\nTop 3 Customers:");
        printTop3(accounts);
    }

    static void deposit(Map<String, Double> map, String acc, double amount) {
        if (!map.containsKey(acc)) {
            System.out.println("Account not found");
            return;
        }
        map.put(acc, map.get(acc) + amount);
    }

    static void withdraw(Map<String, Double> map, String acc, double amount) {
        if (!map.containsKey(acc)) {
            System.out.println("Account not found");
            return;
        }
        if (map.get(acc) < amount) {
            System.out.println("Insufficient balance");
            return;
        }
        map.put(acc, map.get(acc) - amount);
    }

    static void printSorted(Map<String, Double> map) {
        List<Map.Entry<String, Double>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        for (Map.Entry<String, Double> e : list) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }

    static void printTop3(Map<String, Double> map) {
        List<Map.Entry<String, Double>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        for (int i = 0; i < Math.min(3, list.size()); i++) {
            System.out.println(list.get(i).getKey() + " = " + list.get(i).getValue());
        }
    }
}
