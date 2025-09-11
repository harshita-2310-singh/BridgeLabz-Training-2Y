package com.bridgelabz.oops.levelone;

public class BankAccount {
		    String accountHolder;
		    String accountNumber;
		    double balance;
		    public void deposit(double amount) {
		        if (amount > 0) {
		            balance += amount;
		            System.out.println("₹" + amount + " deposited successfully.");
		        } else {
		            System.out.println("Invalid deposit amount.");
		        }
		    }
		    public void withdraw(double amount) {
		        if (amount <= 0) {
		            System.out.println("Invalid withdrawal amount.");
		        } else if (amount > balance) {
		            System.out.println("Insufficient balance. Withdrawal failed.");
		        } else {
		            balance -= amount;
		            System.out.println("₹" + amount + " withdrawn successfully.");
		        }
		    }
		    public void displayBalance() {
		        System.out.println("Account Holder: " + accountHolder);
		        System.out.println("Account Number: " + accountNumber);
		        System.out.println("Current Balance: ₹" + balance);
		    }
		    public static void main(String[] args) {
		        BankAccount account = new BankAccount();
		        account.accountHolder = "Rahul Mehta";
		        account.accountNumber = "1234567890";
		        account.balance = 10000.00;
		        account.displayBalance();
		        System.out.println();

		        account.deposit(5000);
		        account.displayBalance();
		        System.out.println();

		        account.withdraw(3000);
		        account.displayBalance();
		        System.out.println();

		        account.withdraw(15000);
		    }
		}
