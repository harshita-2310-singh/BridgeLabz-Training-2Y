import java.util.*;

public class InventoryManager {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();

        addProduct(inventory, "Apple", 50);
        addProduct(inventory, "Milk", 20);
        addProduct(inventory, "Bread", 30);

        sellProduct(inventory, "Apple", 10);
        sellProduct(inventory, "Milk", 25);

        restockProduct(inventory, "Milk", 40);
        sellProduct(inventory, "Bread", 30);

        queryProduct(inventory, "Apple");
        queryProduct(inventory, "Milk");
        queryProduct(inventory, "Bread");
        queryProduct(inventory, "Eggs");

        printOutOfStock(inventory);
    }

    static void addProduct(Map<String, Integer> map, String product, int qty) {
        map.put(product, qty);
    }

    static void sellProduct(Map<String, Integer> map, String product, int qty) {
        if (!map.containsKey(product)) return;
        int newQty = map.get(product) - qty;
        if (newQty <= 0) map.put(product, 0);
        else map.put(product, newQty);
    }

    static void restockProduct(Map<String, Integer> map, String product, int qty) {
        map.put(product, map.getOrDefault(product, 0) + qty);
    }

    static void queryProduct(Map<String, Integer> map, String product) {
        if (!map.containsKey(product))
            System.out.println(product + ": not stocked");
        else
            System.out.println(product + ": " + map.get(product));
    }

    static void printOutOfStock(Map<String, Integer> map) {
        System.out.println("Out of Stock Products:");
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() == 0) System.out.println(e.getKey());
        }
    }
}
