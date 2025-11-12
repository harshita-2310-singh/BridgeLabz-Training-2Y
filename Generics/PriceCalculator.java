import java.util.*;

class Product {
    private double price;
    Product(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public String toString() {
        return getClass().getSimpleName() + " - Price: " + price;
    }
}

class Mobile extends Product {
    Mobile(double price) {
        super(price);
    }
}

class Laptop extends Product {
    Laptop(double price) {
        super(price);
    }
}

public class PriceCalculator {
    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Mobile> mobiles = Arrays.asList(new Mobile(15000), new Mobile(20000), new Mobile(25000));
        List<Laptop> laptops = Arrays.asList(new Laptop(50000), new Laptop(70000));

        System.out.println("Total price of mobiles: " + calculateTotal(mobiles));
        System.out.println("Total price of laptops: " + calculateTotal(laptops));
    }
}
