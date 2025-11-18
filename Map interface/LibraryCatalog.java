import java.util.*;

public class LibraryCatalog {
    public static void main(String[] args) {
        Map<String, String> catalog = new HashMap<>();

        addBook(catalog, "978-1111111111", "Java Programming");
        addBook(catalog, "978-2222222222", "Data Structures");
        addBook(catalog, "978-3333333333", "Operating Systems");
        addBook(catalog, "978-4444444444", "Database Management");

        searchByISBN(catalog, "978-2222222222");
        searchByISBN(catalog, "978-9999999999");

        removeBook(catalog, "978-3333333333");

        printSortedCatalog(catalog);

        searchByTitle(catalog, "Java Programming");
        searchByTitle(catalog, "Networks");
    }

    static void addBook(Map<String, String> map, String isbn, String title) {
        map.put(isbn, title);
    }

    static void searchByISBN(Map<String, String> map, String isbn) {
        if (map.containsKey(isbn))
            System.out.println(isbn + " -> " + map.get(isbn));
        else
            System.out.println("Book not found");
    }

    static void removeBook(Map<String, String> map, String isbn) {
        map.remove(isbn);
    }

    static void printSortedCatalog(Map<String, String> map) {
        TreeMap<String, String> sorted = new TreeMap<>(map);
        for (Map.Entry<String, String> e : sorted.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    static void searchByTitle(Map<String, String> map, String title) {
        boolean found = false;
        for (Map.Entry<String, String> e : map.entrySet()) {
            if (e.getValue().equalsIgnoreCase(title)) {
                System.out.println("Found: " + e.getKey() + " -> " + e.getValue());
                found = true;
            }
        }
        if (!found) System.out.println("Book not found");
    }
}
