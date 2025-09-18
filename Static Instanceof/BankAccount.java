package keywords;

 class BankAccount {
	    private static String bankName = "State Bank of India";
	    private static int totalAccounts = 0;
	    
	    private final int accountNumber;
	    private String accountHolderName;

	    public BankAccount(String accountHolderName, int accountNumber) {
	        this.accountHolderName = accountHolderName;
	        this.accountNumber = accountNumber;
	        totalAccounts++;
	    }

	    public static int getTotalAccounts() {
	        return totalAccounts;
	    }

	    public void displayDetails() {
	        System.out.println("Bank Name: " + bankName);
	        System.out.println("Account Holder: " + accountHolderName);
	        System.out.println("Account Number: " + accountNumber);
	    }
	}

 class BankAccountSystem {
	    public static void main(String[] args) {
	        BankAccount acc1 = new BankAccount("Alice", 10101);
	        BankAccount acc2 = new BankAccount("Bob", 20202);

	        if (acc1 instanceof BankAccount) {
	            acc1.displayDetails();
	        }

	        System.out.println();

	        if (acc2 instanceof BankAccount) {
	            acc2.displayDetails();
	        }

	        System.out.println("\nTotal Accounts: " + BankAccount.getTotalAccounts());
	    }
	}
