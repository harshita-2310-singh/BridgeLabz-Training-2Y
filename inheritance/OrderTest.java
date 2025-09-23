class BaseOrder {
    int orderId;
    String orderDate;

    BaseOrder(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}

class ShippedOrderEx extends BaseOrder {
    String trackingNumber;

    ShippedOrderEx(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order shipped. Tracking Number: " + trackingNumber;
    }
}

class DeliveredOrderEx extends ShippedOrderEx {
    String deliveryDate;

    DeliveredOrderEx(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}

public class OrderTest {
    public static void main(String[] args) {
        BaseOrder order1 = new BaseOrder(101, "2025-09-20");
        ShippedOrderEx order2 = new ShippedOrderEx(102, "2025-09-21", "TRK12345");
        DeliveredOrderEx order3 = new DeliveredOrderEx(103, "2025-09-22", "TRK67890", "2025-09-23");

        System.out.println(order1.getOrderStatus());
        System.out.println(order2.getOrderStatus());
        System.out.println(order3.getOrderStatus());
    }
}
