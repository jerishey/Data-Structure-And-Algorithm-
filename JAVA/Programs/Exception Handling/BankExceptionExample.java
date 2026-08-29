import java.util.Scanner;

// Custom Exception
class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Custom Exception
class InvalidAmountException extends Exception {

    public InvalidAmountException(String message) {
        super(message);
    }
}

public class BankExceptionExample {

    static double balance = 10000;

    // Deposit method
    static void deposit(double amount) throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException(
                "Deposit amount must be greater than 0."
            );
        }

        balance += amount;

        System.out.println("Amount Deposited : ₹" + amount);
        System.out.println("New Balance     : ₹" + balance);
    }

    // Withdraw method
    static void withdraw(double amount)
            throws InvalidAmountException, InsufficientBalanceException {

        if (amount <= 0) {
            throw new InvalidAmountException(
                "Withdrawal amount must be greater than 0."
            );
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance! Available balance: ₹" + balance
            );
        }

        balance -= amount;

        System.out.println("Amount Withdrawn : ₹" + amount);
        System.out.println("Remaining Balance: ₹" + balance);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("===== BANKING SYSTEM =====");

            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            System.out.print("Enter amount: ");

            double amount = scanner.nextDouble();

            try {

                if (choice == 1) {

                    deposit(amount);

                } else if (choice == 2) {

                    withdraw(amount);

                } else {

                    throw new IllegalArgumentException(
                        "Invalid choice! Choose 1 or 2."
                    );
                }

            } catch (InvalidAmountException e) {

                System.out.println("Invalid Amount: " + e.getMessage());

            } catch (InsufficientBalanceException e) {

                System.out.println("Transaction Failed: " + e.getMessage());

            }

        } catch (java.util.InputMismatchException e) {

            System.out.println(
                "Invalid input! Please enter numbers only."
            );

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("\nTransaction process completed.");

            scanner.close();
        }
    }
}