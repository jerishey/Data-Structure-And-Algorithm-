import java.util.Scanner;

class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Name   : " + name);
        System.out.println("Salary : ₹" + salary);
    }
}

class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage) {

        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDeveloper() {

        displayEmployee();
        System.out.println("Language: " + programmingLanguage);
    }
}

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Developer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Programming Language: ");
        String language = sc.nextLine();

        Developer developer =
                new Developer(name, salary, language);

        System.out.println("\n===== Developer Details =====");
        developer.displayDeveloper();

        sc.close();
    }
}