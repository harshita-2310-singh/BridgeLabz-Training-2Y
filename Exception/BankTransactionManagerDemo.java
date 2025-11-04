class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankTransaction {
    private boolean accountExists = false;
    private double balance = 2000;

    public void verifyAccount() throws AccountNotFoundException {
        if (!accountExists) {
            throw new AccountNotFoundException("Account not found: please check account details.");
        }
    }

    public void processTransaction(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Transaction failed: insufficient funds.");
        }
        balance -= amount;
        System.out.println("Transaction successful. Remaining balance: " + balance);
    }

    public void executeTransaction(double amount) throws Exception {
        verifyAccount();
        processTransaction(amount);
    }
}

public class BankTransactionManagerDemo {
    public static void main(String[] args) {
        BankTransaction transaction = new BankTransaction();

        try {
            transaction.executeTransaction(1000);
        } catch (AccountNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction complete.");
        }
    }
}
