import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private List<BankAccount> accounts;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    // Create a new bank account
    public void createAccount(String accountHolderName, double initialBalance) {
        if (initialBalance < 0) {
            System.out.println("Error: Initial balance cannot be negative.");
            return;
        }
        BankAccount newAccount = new BankAccount(accountHolderName, initialBalance);
        accounts.add(newAccount);
        System.out.println("\nAccount created successfully!");
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + newAccount.getAccountNumber());
        System.out.println("Initial Balance: $" + initialBalance);
    }

    // Deposit money into an account
    public void depositToAccount(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Error: Account not found.");
        }
    }

    // Withdraw money from an account
    public void withdrawFromAccount(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Error: Account not found.");
        }
    }

    // Display account details
    public void displayAccountDetails(String accountNumber) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.displayAccountDetails();
        } else {
            System.out.println("Error: Account not found.");
        }
    }

    // Helper method to find an account by number
    private BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}