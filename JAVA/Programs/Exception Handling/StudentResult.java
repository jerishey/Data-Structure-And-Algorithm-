import java.util.Scanner;

// Custom Exception
class InvalidMarksException extends Exception {

    public InvalidMarksException(String message) {
        super(message);
    }
}

public class StudentResult {

    // Method to calculate percentage
    static double calculatePercentage(int[] marks)
            throws InvalidMarksException {

        int total = 0;

        for (int mark : marks) {

            if (mark < 0 || mark > 100) {
                throw new InvalidMarksException(
                    "Marks must be between 0 and 100."
                );
            }

            total += mark;
        }

        return (double) total / marks.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter number of subjects: ");
            int n = sc.nextInt();

            if (n <= 0) {
                throw new IllegalArgumentException(
                    "Number of subjects must be greater than 0."
                );
            }

            int[] marks = new int[n];

            for (int i = 0; i < n; i++) {

                System.out.print(
                    "Enter marks for subject " + (i + 1) + ": "
                );

                marks[i] = sc.nextInt();
            }

            double percentage = calculatePercentage(marks);

            System.out.println("\n----- Result -----");
            System.out.println("Percentage: " + percentage + "%");

            if (percentage >= 40) {
                System.out.println("Result: PASS");
            } else {
                System.out.println("Result: FAIL");
            }

        } catch (InvalidMarksException e) {

            System.out.println("Marks Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {

            System.out.println("Input Error: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("Unexpected Error: " + e.getMessage());

        } finally {

            System.out.println("\nProgram execution completed.");

            sc.close();
        }
    }
}