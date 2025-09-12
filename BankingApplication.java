import java.util.ArrayList;
import java.util.Scanner;

// BankAccount class to represent each account
class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Amount deposited successfully.");
        } else {
            System.out.println("❌ Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("✅ Amount withdrawn successfully.");
        } else {
            System.out.println("❌ Insufficient balance or invalid amount.");
        }
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}

// Main application
public class BankingApplication {
    private static ArrayList<BankAccount> accounts = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n====== Banking System Menu ======");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    System.out.println("👋 Thank you for using the Banking Application!");
                    break;
                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }
        } while (choice != 5);
    }

    // Method to create account
    private static void createAccount() {
        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accNum, name, balance);
        accounts.add(account);
        System.out.println("✅ Account created successfully!");
    }

    // Method to deposit money
    private static void depositMoney() {
        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();
        BankAccount account = findAccount(accNum);

        if (account != null) {
            System.out.print("Enter amount to deposit: ");
            double amount = sc.nextDouble();
            account.deposit(amount);
        } else {
            System.out.println("❌ Account not found.");
        }
    }

    // Method to withdraw money
    private static void withdrawMoney() {
        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();
        BankAccount account = findAccount(accNum);

        if (account != null) {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
        } else {
            System.out.println("❌ Account not found.");
        }
    }

    // Method to check balance
    private static void checkBalance() {
        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();
        BankAccount account = findAccount(accNum);

        if (account != null) {
            account.displayAccount();
        } else {
            System.out.println("❌ Account not found.");
        }
    }

    // Helper method to find account
    private static BankAccount findAccount(int accNum) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber() == accNum) {
                return acc;
            }
        }
        return null;
    }
}
