class BankAccountBase {
    String accountNumber;
    double balance;

    BankAccountBase(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccountEx extends BankAccountBase {
    double interestRate;

    SavingsAccountEx(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    void displayAccountType() {
        System.out.println("This is a Savings Account.");
    }
}

class CheckingAccountEx extends BankAccountBase {
    double withdrawalLimit;

    CheckingAccountEx(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }

    void displayAccountType() {
        System.out.println("This is a Checking Account.");
    }
}

class FixedDepositAccountEx extends BankAccountBase {
    int depositTerm; 

    FixedDepositAccountEx(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Deposit Term: " + depositTerm + " months");
    }

    void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account.");
    }
}

public class BankTest {
    public static void main(String[] args) {
        SavingsAccountEx sa = new SavingsAccountEx("SA1001", 5000.0, 4.5);
        CheckingAccountEx ca = new CheckingAccountEx("CA2001", 3000.0, 1000.0);
        FixedDepositAccountEx fda = new FixedDepositAccountEx("FD3001", 10000.0, 24);

        sa.displayAccountType();
        sa.displayDetails();
        System.out.println();

        ca.displayAccountType();
        ca.displayDetails();
        System.out.println();

        fda.displayAccountType();
        fda.displayDetails();
    }
}
