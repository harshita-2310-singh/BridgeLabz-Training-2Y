import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    public Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return String.format("%s [%.2f, %.1f, %s%% off]", name, price, rating, discount);
    }
}

public class EcommerceSorting {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", 25000, 4.5, 10));
        products.add(new Product("Laptop", 75000, 4.8, 15));
        products.add(new Product("Headphones", 2000, 4.3, 25));
        products.add(new Product("Smartwatch", 5000, 4.1, 5));

        System.out.println("Original List:");
        products.forEach(System.out::println);


        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("\nSorted by Price (Low → High):");
        products.forEach(System.out::println);


        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        System.out.println("\nSorted by Rating (High → Low):");
        products.forEach(System.out::println);

        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        System.out.println("\nSorted by Discount (High → Low):");
        products.forEach(System.out::println);
    }
}
