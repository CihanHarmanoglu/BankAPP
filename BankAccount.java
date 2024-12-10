package Project1.BankApp;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
    public void deposit (double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("To Account: " + amount + " $ deposited");
        } else {
            System.out.println("Invalid amount");
        }
    }
    public void withdraw (double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("To account " + amount + " $ was withdrawn");
        } else {
            System.out.println("Invalid amount or balance");
        }
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }


}
