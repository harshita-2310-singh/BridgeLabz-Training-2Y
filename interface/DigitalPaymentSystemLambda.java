@FunctionalInterface
interface Payment {
    void pay();
}

public class DigitalPaymentSystemLambda {
    public static void main(String[] args) {
        Payment upi = () -> System.out.println("Payment made via UPI.");
        Payment creditCard = () -> System.out.println("Payment made via Credit Card.");
        Payment wallet = () -> System.out.println("Payment made via Wallet.");

        upi.pay();
        creditCard.pay();
        wallet.pay();
    }
}
