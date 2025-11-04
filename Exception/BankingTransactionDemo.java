import java.util.Random;

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class NetworkFailureException extends Exception {
    public NetworkFailureException(String message) {
        super(message);
    }
}

class Transaction {
    private double balance = 5000;

    public void processTransaction(double amount)
            throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {

        Random random = new Random();
        int issue = random.nextInt(4);

        if (amount < 0) {
            throw new NegativeAmountException("Transaction failed: Amount cannot be negative.");
        } else if (amount > balance) {
            throw new InsufficientFundsException("Transaction failed: Insufficient balance.");
        } else if (issue == 3) {
            throw new NetworkFailureException("Transaction failed: Network connectivity issue.");
        } else {
            balance -= amount;
            System.out.println("Transaction successful. Withdrawn: ₹" + amount);
            System.out.println("Remaining balance: ₹" + balance);
        }
    }
}

public class BankingTransactionDemo {
    public static void main(String[] args) {
        Transaction transaction = new Transaction();

        try {
            transaction.processTransaction(2000);
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank you for using our banking service.");
        }
    }
}
