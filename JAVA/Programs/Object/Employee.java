package Object;

class Employee {

    // Instance variables
    private int id;
    private String name;
    private double salary;

    // Static variable
    private static String company = "Tech Solutions";

    // Constructor
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Increase salary
    void increaseSalary(double percentage) {
        salary += salary * percentage / 100;
    }

    // Display employee details
    void display() {
        System.out.println("-------------------------");
        System.out.println("Employee ID     : " + id);
        System.out.println("Employee Name   : " + name);
        System.out.println("Salary          : ₹" + salary);
        System.out.println("Company         : " + company);
    }

    // Static method
    static void changeCompany(String newCompany) {
        company = newCompany;
    }

    public static void main(String[] args) {

        // Creating objects
        Employee e1 = new Employee(101, "Rakesh", 50000);
        Employee e2 = new Employee(102, "Aman", 60000);
        Employee e3 = new Employee(103, "Rahul", 45000);

        // Display employees
        e1.display();
        e2.display();
        e3.display();

        // Increase salary of one object
        System.out.println("\nIncreasing Rakesh's salary by 10%...");
        e1.increaseSalary(10);

        // Change company for all objects
        System.out.println("\nChanging company...");
        Employee.changeCompany("Google");

        // Display updated information
        e1.display();
        e2.display();
        e3.display();
    }
}