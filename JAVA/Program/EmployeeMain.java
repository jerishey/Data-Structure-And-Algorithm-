import java.util.Scanner;

class Employee {

    int id;
    String name;
    double salary;

    void getData(Scanner sc) {

        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        salary = sc.nextDouble();
    }

    void display() {

        System.out.println("\nEmployee Details");
        System.out.println("----------------");
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Salary : ₹" + salary);
    }
}

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();   // Object Creation

        emp.getData(sc);
        emp.display();

        sc.close();
    }
}