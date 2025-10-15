public class PaymentGatewayIntegration {

    interface PaymentProvider {
        void pay(double amount);

    
        default void refund(double amount) {
            System.out.println("Refund of $" + amount + " processed (default implementation).");
        }
    }


    static class OldPaymentProvider implements PaymentProvider {
        public void pay(double amount) {
            System.out.println("Old provider paid $" + amount);
        }
    }
    static class NewPaymentProvider implements PaymentProvider {
        public void pay(double amount) {
            System.out.println("New provider paid $" + amount);
        }

        public void refund(double amount) {
            System.out.println("New provider refunded $" + amount);
        }
    }

    public static void main(String[] args) {
        PaymentProvider oldProvider = new OldPaymentProvider();

        PaymentProvider newProvider = new NewPaymentProvider();
        PaymentProvider lambdaProvider = (amount) -> System.out.println("Lambda provider paid $" + amount);

        System.out.println("=== Payment ===");
        oldProvider.pay(100);
        newProvider.pay(200);
        lambdaProvider.pay(150);

        System.out.println("\n=== Refund ===");
        oldProvider.refund(50);       
        newProvider.refund(75);      
        lambdaProvider.refund(30);    
    }
}
