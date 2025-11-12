import java.util.*;

class Order {
    int orderId;
    String customerName;
    double amount;

    Order(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return orderId == order.orderId;
    }

    public int hashCode() {
        return Objects.hash(orderId);
    }

    public String toString() {
        return "Order{" + "ID=" + orderId + ", Customer='" + customerName + "', Amount=" + amount + '}';
    }
}

public class ECommerceOrderSystem {
    public static void main(String[] args) {
        List<Order> allOrders = new ArrayList<>();
        allOrders.add(new Order(101, "Alice", 2500));
        allOrders.add(new Order(102, "Bob", 1800));
        allOrders.add(new Order(101, "Alice", 2500));
        allOrders.add(new Order(103, "Charlie", 3200));

        Set<Order> uniqueOrders = new LinkedHashSet<>(allOrders);

        Queue<Order> processingQueue = new LinkedList<>(uniqueOrders);
        Stack<Order> failedStack = new Stack<>();

        System.out.println("Processing Orders:");
        while (!processingQueue.isEmpty()) {
            Order order = processingQueue.poll();
            if (order.orderId == 102) {
                System.out.println("Order Failed: " + order);
                failedStack.push(order);
            } else {
                System.out.println("Order Processed: " + order);
            }
        }

        System.out.println("\nReprocessing Failed Orders:");
        while (!failedStack.isEmpty()) {
            Order failedOrder = failedStack.pop();
            System.out.println("Reprocessing: " + failedOrder);
        }
    }
}
