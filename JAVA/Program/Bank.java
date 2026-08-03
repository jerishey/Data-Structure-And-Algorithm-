import java.util.Scanner;

class BankAccount {

    String accountHolder;
    int accountNumber;
    double balance;

    // Method to take input
    void createAccount(Scanner sc) {

        System.out.print("Enter Account Holder Name: ");
        accountHolder = sc.nextLine();

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    // Deposit money
    void deposit(Scanner sc) {

        System.out.print("\nEnter Deposit Amount: ");
        double amount = sc.nextDouble();

        balance += amount;

        System.out.println("Amount Deposited Successfully.");
    }

    // Withdraw money
    void withdraw(Scanner sc) {

        System.out.print("\nEnter Withdrawal Amount: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    // Display account details
    void display() {

        System.out.println("\n===== Account Details =====");
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : ₹" + balance);
    }
}

public class Bank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        account.createAccount(sc);
        account.deposit(sc);
        account.withdraw(sc);
        account.display();

        sc.close();
    }
}