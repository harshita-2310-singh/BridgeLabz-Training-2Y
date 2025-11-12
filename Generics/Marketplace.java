interface BookCategory {
    String getGenre();
}

interface ClothingCategory {
    String getType();
}

interface GadgetCategory {
    String getBrand();
}

class Product<T> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public T getCategory() { return category; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "Product: " + name + ", Price: ₹" + price + ", Category: " + category;
    }
}

class Book implements BookCategory {
    private String genre;
    public Book(String genre) { this.genre = genre; }
    public String getGenre() { return genre; }
    public String toString() { return "Book Genre: " + genre; }
}

class Clothing implements ClothingCategory {
    private String type;
    public Clothing(String type) { this.type = type; }
    public String getType() { return type; }
    public String toString() { return "Clothing Type: " + type; }
}

class Gadget implements GadgetCategory {
    private String brand;
    public Gadget(String brand) { this.brand = brand; }
    public String getBrand() { return brand; }
    public String toString() { return "Gadget Brand: " + brand; }
}

class DiscountManager {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double newPrice = product.getPrice() - (product.getPrice() * (percentage / 100));
        product.setPrice(newPrice);
        System.out.println("Discount Applied! New price of " + product.getName() + " = ₹" + newPrice);
    }
}

public class Marketplace {
    public static void main(String[] args) {
        Product<Book> book = new Product<>("Java Programming", 500, new Book("Education"));
        Product<Clothing> shirt = new Product<>("T-Shirt", 800, new Clothing("Casual"));
        Product<Gadget> phone = new Product<>("Smartphone", 25000, new Gadget("Samsung"));

        System.out.println("=== Before Discount ===");
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);

        DiscountManager.applyDiscount(book, 10);
        DiscountManager.applyDiscount(shirt, 20);
        DiscountManager.applyDiscount(phone, 15);

        System.out.println("\n=== After Discount ===");
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);
    }
}
