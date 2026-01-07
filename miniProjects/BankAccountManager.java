package miniProjects;

import java.util.*;

class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void transfer(BankAccount toAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            toAccount.balance += amount;
            System.out.println("Transferred " + amount + " to " + toAccount.getName());
        } else {
            System.out.println("Transfer failed! Check amount or balance.");
        }
    }

    public void display() {
        System.out.println("Account Holder: " + name + ", Balance: " + balance);
    }
}

public class BankAccountManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Check Balance");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter account holder name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter initial balance: ");
                    double balance = sc.nextDouble();
                    accounts.add(new BankAccount(name, balance));
                    System.out.println("Account created for " + name);
                }
                case 2 -> {
                    BankAccount acc = selectAccount(accounts, sc);
                    if (acc != null) {
                        System.out.print("Enter deposit amount: ");
                        double amt = sc.nextDouble();
                        acc.deposit(amt);
                    }
                }
                case 3 -> {
                    BankAccount acc = selectAccount(accounts, sc);
                    if (acc != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double amt = sc.nextDouble();
                        acc.withdraw(amt);
                    }
                }
                case 4 -> {
                    System.out.println("Select source account:");
                    BankAccount fromAcc = selectAccount(accounts, sc);
                    System.out.println("Select destination account:");
                    BankAccount toAcc = selectAccount(accounts, sc);
                    if (fromAcc != null && toAcc != null) {
                        System.out.print("Enter transfer amount: ");
                        double amt = sc.nextDouble();
                        fromAcc.transfer(toAcc, amt);
                    }
                }
                case 5 -> accounts.forEach(BankAccount::display);
                case 6 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }

    // Helper method to select account
    private static BankAccount selectAccount(List<BankAccount> accounts, Scanner sc) {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available!");
            return null;
        }
        System.out.println("Available accounts:");
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println((i + 1) + ". " + accounts.get(i).getName());
        }
        System.out.print("Select account number: ");
        int idx = sc.nextInt() - 1;
        if (idx < 0 || idx >= accounts.size()) {
            System.out.println("Invalid selection!");
            return null;
        }
        return accounts.get(idx);
    }
}
