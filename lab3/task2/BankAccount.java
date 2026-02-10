package lab3;

public class BankAccount {

    private static int totalAccounts;

    private final int accountNumber;

    private final AccountType type;

    private double balance;

    {
        totalAccounts++;
    }

    public BankAccount(int accountNumber, AccountType type) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.balance = 0;
    }

    public BankAccount(int accountNumber, AccountType type, double balance) {
        this(accountNumber, type);
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void deposit(double amount, String currency) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public AccountType getType() {
        return type;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }
}
