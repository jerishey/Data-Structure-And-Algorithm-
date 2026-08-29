import java.util.Scanner;

// Custom Exception 1
class InvalidSalaryException extends Exception {

    public InvalidSalaryException(String message) {
        super(message);
    }
}

// Custom Exception 2
class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

// Custom Exception 3
class EmployeeNotFoundException extends Exception {

    public EmployeeNotFoundException(String message) {
        super(message);
    }
}

public class EmployeeManagement {

    static String[] employeeNames = {
        "Rakesh",
        "Aman",
        "Rahul",
        "Priya"
    };

    static int[] employeeAges = {
        22,
        25,
        28,
        24
    };

    static double[] employeeSalaries = {
        35000,
        45000,
        55000,
        40000
    };

    // Validate Age
    static void validateAge(int age) throws InvalidAgeException {

        if (age < 18 || age > 60) {
            throw new InvalidAgeException(
                "Employee age must be between 18 and 60."
            );
        }
    }

    // Validate Salary
    static void validateSalary(double salary)
            throws InvalidSalaryException {

        if (salary < 15000) {
            throw new InvalidSalaryException(
                "Salary cannot be less than ₹15,000."
            );
        }
    }

    // Search Employee
    static int searchEmployee(String name)
            throws EmployeeNotFoundException {

        for (int i = 0; i < employeeNames.length; i++) {

            if (employeeNames[i].equalsIgnoreCase(name)) {
                return i;
            }
        }

        throw new EmployeeNotFoundException(
            "Employee '" + name + "' was not found."
        );
    }

    // Display Employee
    static void displayEmployee(String name)
            throws EmployeeNotFoundException {

        int index = searchEmployee(name);

        System.out.println("\n===== EMPLOYEE DETAILS =====");

        System.out.println("Name   : " + employeeNames[index]);
        System.out.println("Age    : " + employeeAges[index]);
        System.out.println("Salary : ₹" + employeeSalaries[index]);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("===== EMPLOYEE MANAGEMENT =====");

            System.out.println("1. Validate Employee");
            System.out.println("2. Search Employee");

            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    try {

                        System.out.print("Enter employee age: ");
                        int age = scanner.nextInt();

                        validateAge(age);

                        System.out.print("Enter employee salary: ");
                        double salary = scanner.nextDouble();

                        validateSalary(salary);

                        System.out.println(
                            "\nEmployee information is valid."
                        );

                    } catch (InvalidAgeException e) {

                        System.out.println(
                            "Age Error: " + e.getMessage()
                        );

                    } catch (InvalidSalaryException e) {

                        System.out.println(
                            "Salary Error: " + e.getMessage()
                        );

                    }

                    break;

                case 2:

                    scanner.nextLine();

                    System.out.print("Enter employee name: ");

                    String name = scanner.nextLine();

                    try {

                        displayEmployee(name);

                    } catch (EmployeeNotFoundException e) {

                        System.out.println(
                            "Search Error: " + e.getMessage()
                        );
                    }

                    break;

                default:

                    throw new IllegalArgumentException(
                        "Invalid menu choice."
                    );
            }

        } catch (java.util.InputMismatchException e) {

            System.out.println(
                "Input Error: Please enter the correct data type."
            );

        } catch (IllegalArgumentException e) {

            System.out.println(
                "Choice Error: " + e.getMessage()
            );

        } finally {

            System.out.println(
                "\nProgram execution completed."
            );

            scanner.close();
        }
    }
}