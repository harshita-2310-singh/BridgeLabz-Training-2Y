package keywords;

public class Product {
	    private static double discount = 10.0; 

	    private String productName;
	    private double price;
	    private int quantity;
	    private final String productID;

	    public Product(String productName, double price, int quantity, String productID) {
	        this.productName = productName;
	        this.price = price;
	        this.quantity = quantity;
	        this.productID = productID;
	    }

	    public static void updateDiscount(double newDiscount) {
	        discount = newDiscount;
	        System.out.println("Discount updated to: " + discount + "%");
	    }

	    public void displayDetails() {
	        double total = price * quantity;
	        double discountedTotal = total - (total * discount / 100);

	        System.out.println("Product ID: " + productID);
	        System.out.println("Name: " + productName);
	        System.out.println("Price: $" + price);
	        System.out.println("Quantity: " + quantity);
	        System.out.println("Total (before discount): $" + total);
	        System.out.println("Total (after " + discount + "% discount): $" + discountedTotal);
	    }

	    public void processIfProduct(Object obj) {
	        if (obj instanceof Product) {
	            ((Product) obj).displayDetails();
	        } else {
	            System.out.println("Invalid product object.");
	        }
	    }
	}

	class ShoppingCartSystem {
	    public static void main(String[] args) {
	        Product product1 = new Product("Laptop", 1200.00, 1, "P1001");
	        Product product2 = new Product("Headphones", 150.00, 2, "P1002");

	        product1.processIfProduct(product1);
	        System.out.println();
	        product2.processIfProduct(product2);

	        System.out.println();
	        Product.updateDiscount(15.0);  

	        System.out.println();
	        product1.processIfProduct(product1);  
	    }
	}
