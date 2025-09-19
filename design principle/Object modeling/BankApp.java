package objectmodeling;

public class BankApp {
	    public static void main(String[] args) {
	        Bank bank = new Bank("Nice Bank");

	        Person p1 = new Person("John");
	        Person p2 = new Person("Emma");

	        bank.createAccount(p1, 1000.0);
	        bank.createAccount(p1, 2000.0);
	        bank.createAccount(p2, 500.0);

	        p1.showAccounts();
	        p2.showAccounts();
	    }
	}

	class Bank {
	    String name;

	    Bank(String name) {
	        this.name = name;
	    }

	    void createAccount(Person person, double amount) {
	        Account acc = new Account(this, person, amount);
	        person.addAccount(acc);
	        System.out.println("Account created for " + person.name + " at " + name + " with balance " + amount);
	    }
	}

	class Person {
	    String name;
	    Account[] accounts = new Account[10];
	    int count = 0;

	    Person(String name) {
	        this.name = name;
	    }

	    void addAccount(Account acc) {
	        if (count < accounts.length) {
	            accounts[count++] = acc;
	        }
	    }

	    void showAccounts() {
	        System.out.println(name + "'s Accounts:");
	        for (int i = 0; i < count; i++) {
	            System.out.println("Bank: " + accounts[i].bank.name + ", Balance: " + accounts[i].balance);
	        }
	        System.out.println();
	    }
	}

	class Account {
	    Bank bank;
	    Person owner;
	    double balance;

	    Account(Bank bank, Person owner, double balance) {
	        this.bank = bank;
	        this.owner = owner;
	        this.balance = balance;
	    }
	}
