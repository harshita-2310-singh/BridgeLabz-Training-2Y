package constructorslevel1;

public class BankAccount {
	    public String accountNumber;
	    protected String accountHolder;
	    private double balance;

	    BankAccount(String accountNumber, String accountHolder, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountHolder = accountHolder;
	        this.balance = balance;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    void displayAccountDetails() {
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Balance: " + balance);
	        System.out.println();
	    }
	}

	class SavingsAccount extends BankAccount {
	    double interestRate;

	    SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
	        super(accountNumber, accountHolder, balance);
	        this.interestRate = interestRate;
	    }

	    void displaySavingsDetails() {
	        System.out.println("Savings Account Number: " + accountNumber); 
	        System.out.println("Account Holder: " + accountHolder);       
	        System.out.println("Balance: " + getBalance());                 
	        System.out.println("Interest Rate: " + interestRate + "%");
	        System.out.println();
	    }
	}

	class BankDemo {
	    public static void main(String[] args) {
	        BankAccount b1 = new BankAccount("AC101", "Rahul Sharma", 50000);
	        b1.displayAccountDetails();

	        b1.setBalance(60000);
	        b1.displayAccountDetails();

	        SavingsAccount s1 = new SavingsAccount("AC202", "Sneha Gupta", 80000, 4.5);
	        s1.displaySavingsDetails();
	    }
	}


