import java.util.Scanner;

class Student {

    String name;
    int age;

    void getData(Scanner sc) {

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Student Age: ");
        age = sc.nextInt();
    }

    void display() {

        System.out.println("\nStudent Details");
        System.out.println("---------------");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.getData(sc);
        student.display();

        sc.close();
    }
}