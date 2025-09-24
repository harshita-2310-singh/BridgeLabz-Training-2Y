abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.1;
    }

    public double calculateTax() {
        return getPrice() * 0.18;
    }

    public String getTaxDetails() {
        return "18% GST";
    }
}

class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.2;
    }

    public double calculateTax() {
        return getPrice() * 0.12;
    }

    public String getTaxDetails() {
        return "12% GST";
    }
}

class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

public class ECom {
    public static void main(String[] args) {
        Product[] products = {
            new Electronics(201, "Smartphone", 30000),
            new Clothing(202, "T-Shirt", 1500),
            new Groceries(203, "Rice", 800)
        };

        for (Product p : products) {
            double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;
            double discount = p.calculateDiscount();
            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("Product: " + p.getName());
            System.out.println("Base Price: " + p.getPrice());
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            if (p instanceof Taxable) {
                System.out.println("Tax Details: " + ((Taxable) p).getTaxDetails());
            } else {
                System.out.println("Tax Details: No Tax");
            }
            System.out.println("Final Price: " + finalPrice);
            System.out.println();
        }
    }
}
