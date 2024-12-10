package Project1.BankApp;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;

        while(true) {
            System.out.println("\n=== Bank APP ===");
            System.out.println("1. Crete new account");
            System.out.println("2. Withdraw money");
            System.out.println("3. Deposit money");
            System.out.println("4. View balance");
            System.out.println("5. Exit");
            System.out.println("Your Choice");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter account number: ");
                    String accountNumber = scanner.next();
                    account = new BankAccount(accountNumber);
                    System.out.println("New account has created: " + account.getAccountNumber());
                    break;
                case 2:
                    if (account != null) {
                        System.out.println("The amount you wish to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("You need to create new account first.");
                    }
                    break;

                case 3:
                    if (account != null) {
                        System.out.println("The amount you wish to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                    } else {
                        System.out.println("You need to create new account first.");
                    }
                    break;

                case 4:
                    if (account != null) {
                        System.out.println("Balance: " + account.getBalance() + " $");
                    } else {
                        System.out.println("You need to create new account first.");
                    }
                    break;

                case 5:
                    System.out.println("Exit is in progress...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

}
