import java.util.Random;
class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}
class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) {
        super(message);
    }
}
class OrderSystem {

    public void placeOrder() throws OutOfStockException, PaymentFailedException {
        Random random = new Random();
        int status = random.nextInt(3); 

        switch (status) {
            case 0:
                throw new OutOfStockException(" Sorry, the product is out of stock!");
            case 1:
                throw new PaymentFailedException(" Payment failed! Please check your card or try again.");
            case 2:
                System.out.println(" Order placed successfully! ");
                break;
        }
    }
}

// Main Class
public class OrderProcessingDemo {
    public static void main(String[] args) {
        OrderSystem order = new OrderSystem();

        try {
            order.placeOrder();
        } 
        catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        } 
        catch (PaymentFailedException e) {
            System.out.println(e.getMessage());
        } 
        finally {
            System.out.println(" Thank you for shopping with us!");
        }
    }
}
