package objectmodeling;

public class EcommerceApp {
	    public static void main(String[] args) {
	        Customer customer1 = new Customer("Alice");

	        Product p1 = new Product("Laptop", 800.0);
	        Product p2 = new Product("Mouse", 25.0);
	        Product p3 = new Product("Keyboard", 45.0);

	        Order order1 = customer1.placeOrder(new Product[]{p1, p2});
	        Order order2 = customer1.placeOrder(new Product[]{p3});

	        order1.showOrderDetails();
	        order2.showOrderDetails();
	    }
	}

	class Customer {
	    String name;
	    int orderCount = 0;
	    Order[] orders = new Order[10];

	    Customer(String name) {
	        this.name = name;
	    }

	    Order placeOrder(Product[] products) {
	        if (orderCount < orders.length) {
	            Order order = new Order(this, products);
	            orders[orderCount++] = order;
	            System.out.println(name + " placed an order with " + products.length + " products.");
	            return order;
	        }
	        return null;
	    }
	}

	class Product {
	    String name;
	    double price;

	    Product(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }

	    String getInfo() {
	        return name + " - $" + price;
	    }
	}

	class Order {
	    static int nextOrderId = 1;
	    int orderId;
	    Customer customer;
	    Product[] products;

	    Order(Customer customer, Product[] products) {
	        this.customer = customer;
	        this.products = products;
	        this.orderId = nextOrderId++;
	    }

	    void showOrderDetails() {
	        System.out.println("Order #" + orderId + " by " + customer.name + ":");
	        double total = 0;
	        for (Product p : products) {
	            System.out.println(" - " + p.getInfo());
	            total += p.price;
	        }
	        System.out.println("Total: $" + total + "\n");
	    }
	}

