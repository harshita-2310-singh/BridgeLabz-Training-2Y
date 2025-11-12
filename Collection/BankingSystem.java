import java.util.*;

class Account {
    String accountId;
    double balance;

    Account(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account a = (Account) o;
        return accountId.equals(a.accountId);
    }

    public int hashCode() {
        return Objects.hash(accountId);
    }

    public String toString() {
        return accountId + " (Balance: " + balance + ")";
    }
}

class Transaction {
    String accountId;
    double amount;
    String type;

    Transaction(String accountId, double amount, String type) {
        this.accountId = accountId;
        this.amount = amount;
        this.type = type;
    }

    public String toString() {
        return type + " ₹" + amount + " for " + accountId;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Set<Account> validAccounts = new HashSet<>(Arrays.asList(
            new Account("A101", 5000),
            new Account("A102", 3000),
            new Account("A103", 7000)
        ));

        Queue<Transaction> transactionQueue = new LinkedList<>();
        transactionQueue.add(new Transaction("A101", 1000, "Deposit"));
        transactionQueue.add(new Transaction("A104", 2000, "Withdraw"));
        transactionQueue.add(new Transaction("A102", 1500, "Withdraw"));

        List<Transaction> transactionHistory = new ArrayList<>();
        Stack<Transaction> rollbackStack = new Stack<>();

        System.out.println("Processing Transactions:\n");

        while (!transactionQueue.isEmpty()) {
            Transaction t = transactionQueue.poll();
            Optional<Account> accountOpt = validAccounts.stream()
                    .filter(a -> a.accountId.equals(t.accountId))
                    .findFirst();

            if (accountOpt.isPresent()) {
                Account acc = accountOpt.get();
                if (t.type.equalsIgnoreCase("Deposit")) {
                    acc.balance += t.amount;
                    System.out.println("Deposited ₹" + t.amount + " to " + acc.accountId);
                } else if (t.type.equalsIgnoreCase("Withdraw")) {
                    if (acc.balance >= t.amount) {
                        acc.balance -= t.amount;
                        System.out.println("Withdrew ₹" + t.amount + " from " + acc.accountId);
                    } else {
                        System.out.println("Insufficient balance in " + acc.accountId);
                        continue;
                    }
                }
                transactionHistory.add(t);
                rollbackStack.push(t);
            } else {
                System.out.println("Invalid account: " + t.accountId);
            }
        }

        System.out.println("\nRolling Back Last Transaction:");
        if (!rollbackStack.isEmpty()) {
            Transaction last = rollbackStack.pop();
            validAccounts.stream()
                .filter(a -> a.accountId.equals(last.accountId))
                .findFirst()
                .ifPresent(acc -> {
                    if (last.type.equalsIgnoreCase("Deposit")) acc.balance -= last.amount;
                    else acc.balance += last.amount;
                    System.out.println("Rolled back: " + last);
                });
        }

        System.out.println("\nFinal Account Balances:");
        for (Account a : validAccounts) System.out.println(a);
    }
}
