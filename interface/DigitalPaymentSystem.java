interface Payment {
    void pay();
}

class UPI implements Payment {
    public void pay() {
        System.out.println("Payment made via UPI.");
    }
}

class CreditCard implements Payment {
    public void pay() {
        System.out.println("Payment made via Credit Card.");
    }
}

class Wallet implements Payment {
    public void pay() {
        System.out.println("Payment made via Wallet.");
    }
}

public class DigitalPaymentSystem {
    public static void main(String[] args) {
        Payment upi = new UPI();
        Payment creditCard = new CreditCard();
        Payment wallet = new Wallet();

        upi.pay();
        creditCard.pay();
        wallet.pay();
    }
}
