import java.util.Scanner;

// Custom Exception
class InvalidLoginException extends Exception {

    public InvalidLoginException(String message) {
        super(message);
    }
}

public class LoginSystem {

    static final String CORRECT_USERNAME = "admin";
    static final String CORRECT_PASSWORD = "12345";

    // Login method
    static void login(String username, String password)
            throws InvalidLoginException {

        if (username.isEmpty() || password.isEmpty()) {
            throw new IllegalArgumentException(
                "Username and password cannot be empty."
            );
        }

        if (!username.equals(CORRECT_USERNAME)
                || !password.equals(CORRECT_PASSWORD)) {

            throw new InvalidLoginException(
                "Invalid username or password."
            );
        }

        System.out.println("Login successful!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            login(username, password);

        } catch (InvalidLoginException e) {

            System.out.println("Login Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {

            System.out.println("Input Error: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("Unexpected Error: " + e.getMessage());

        } finally {

            System.out.println("Login process completed.");
            sc.close();
        }
    }
}