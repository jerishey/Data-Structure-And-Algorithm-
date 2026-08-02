import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // String operations
        System.out.println("\nString Operations");
        System.out.println("---------------------------");
        System.out.println("Original String : " + str);
        System.out.println("Length          : " + str.length());
        System.out.println("Uppercase       : " + str.toUpperCase());
        System.out.println("Lowercase       : " + str.toLowerCase());
        System.out.println("First Character : " + str.charAt(0));
        System.out.println("Contains 'Java' : " + str.contains("Java"));
        System.out.println("Substring       : " + str.substring(0, 4));

        sc.close();
    }
}