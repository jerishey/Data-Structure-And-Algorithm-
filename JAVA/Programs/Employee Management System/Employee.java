import java.util.Scanner;

public class Employee {

    static class EmployeeRecord {

        String name;
        long id;
        String designation;
        int experience;
        int age;

        // Constructor
        EmployeeRecord(String name, long id, String designation,
                       int experience, int age) {

            this.name = name;
            this.id = id;
            this.designation = designation;
            this.experience = experience;
            this.age = age;
        }

        // Display employee information
        void display() {

            System.out.println("Name        : " + name);
            System.out.println("Employee ID : " + id);
            System.out.println("Designation : " + designation);
            System.out.println("Experience  : " + experience + " years");
            System.out.println("Age         : " + age);
            System.out.println("--------------------------------");
        }
    }


    static final int MAX = 20;

    static EmployeeRecord[] employees = new EmployeeRecord[MAX];

    static int count = 0;

    static Scanner sc = new Scanner(System.in);


    static void build() {

        System.out.println("\n========== BUILD TABLE ==========");

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        if (n > MAX) {

            System.out.println(
                "Maximum number of employees allowed is " + MAX
            );

            n = MAX;
        }

        if (n < 0) {

            System.out.println("Invalid number of employees.");
            return;
        }

        count = 0;

        for (int i = 0; i < n; i++) {

            System.out.println(
                "\nEnter details for Employee " + (i + 1)
            );

            employees[count] = readEmployee();

            count++;
        }

        System.out.println(
            "\nEmployee table created successfully!"
        );
    }


    static EmployeeRecord readEmployee() {

        System.out.print("Name: ");
        String name = sc.next();

        System.out.print("Employee ID: ");
        long id = sc.nextLong();

        System.out.print("Designation: ");
        String designation = sc.next();

        System.out.print("Experience (years): ");
        int experience = sc.nextInt();

        System.out.print("Age: ");
        int age = sc.nextInt();

        return new EmployeeRecord(
            name,
            id,
            designation,
            experience,
            age
        );
    }



    static void insert() {

        if (count >= MAX) {

            System.out.println(
                "\nEmployee table is full!"
            );

            return;
        }

        System.out.println(
            "\n========== INSERT EMPLOYEE =========="
        );

        employees[count] = readEmployee();

        count++;

        System.out.println(
            "\nEmployee added successfully!"
        );
    }


    static void searchRecord() {

        if (count == 0) {

            System.out.println(
                "\nEmployee table is empty."
            );

            return;
        }

        System.out.println(
            "\n========== SEARCH EMPLOYEE =========="
        );

        System.out.print("Enter Employee ID: ");

        long id = sc.nextLong();

        int index = findEmployee(id);

        if (index == -1) {

            System.out.println(
                "Employee not found!"
            );

            return;
        }

        System.out.println("\nEmployee Found!");

        System.out.println("--------------------------------");

        employees[index].display();
    }


    static int findEmployee(long id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].id == id) {

                return i;
            }
        }

        return -1;
    }


    static void deleteRecord() {

        if (count == 0) {

            System.out.println(
                "\nEmployee table is empty."
            );

            return;
        }

        System.out.println(
            "\n========== DELETE EMPLOYEE =========="
        );

        System.out.print("Enter Employee ID: ");

        long id = sc.nextLong();

        int index = findEmployee(id);

        if (index == -1) {

            System.out.println(
                "Employee not found!"
            );

            return;
        }

        // Shift employees to the left
        for (int i = index; i < count - 1; i++) {

            employees[i] = employees[i + 1];
        }

        // Remove last duplicate reference
        employees[count - 1] = null;

        count--;

        System.out.println(
            "Employee deleted successfully!"
        );
    }


    static void displayRecords() {

        if (count == 0) {

            System.out.println(
                "\nNo employee records available."
            );

            return;
        }

        System.out.println(
            "\n========== EMPLOYEE RECORDS =========="
        );

        for (int i = 0; i < count; i++) {

            System.out.println(
                "\nEmployee " + (i + 1)
            );

            System.out.println(
                "--------------------------------"
            );

            employees[i].display();
        }
    }


    static void showMenu() {

        while (true) {

            System.out.println(
                "\n======================================"
            );

            System.out.println(
                "       EMPLOYEE MANAGEMENT SYSTEM"
            );

            System.out.println(
                "======================================"
            );

            System.out.println(
                "1. Build Employee Table"
            );

            System.out.println(
                "2. Insert New Employee"
            );

            System.out.println(
                "3. Delete Employee"
            );

            System.out.println(
                "4. Search Employee"
            );

            System.out.println(
                "5. Display All Employees"
            );

            System.out.println(
                "6. Exit"
            );

            System.out.println(
                "--------------------------------------"
            );

            System.out.print(
                "Enter your choice: "
            );

            int option = sc.nextInt();


            switch (option) {

                case 1:
                    build();
                    break;

                case 2:
                    insert();
                    break;

                case 3:
                    deleteRecord();
                    break;

                case 4:
                    searchRecord();
                    break;

                case 5:
                    displayRecords();
                    break;

                case 6:

                    System.out.println(
                        "\nThank you for using "
                        + "Employee Management System!"
                    );

                    sc.close();

                    return;

                default:

                    System.out.println(
                        "\nInvalid choice!"
                    );

                    System.out.println(
                        "Please select an option from 1 to 6."
                    );
            }
        }
    }


    public static void main(String[] args) {

        showMenu();
    }
}