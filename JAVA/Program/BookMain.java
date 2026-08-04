import java.util.Scanner;

class Book {

    String title;
    String author;
    double price;

    void getData(Scanner sc) {

        System.out.print("Enter Book Title: ");
        title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        author = sc.nextLine();

        System.out.print("Enter Book Price: ");
        price = sc.nextDouble();
    }

    void display() {

        System.out.println("\nBook Details");
        System.out.println("------------");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : ₹" + price);
    }
}

public class BookMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book book = new Book();   // Object Creation

        book.getData(sc);
        book.display();

        sc.close();
    }
}