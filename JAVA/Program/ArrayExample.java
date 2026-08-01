import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        // Create an array
        int[] numbers = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Display array elements
        System.out.println("\nArray Elements:");

        for (int i = 0; i < size; i++) {
            System.out.println("Element at index " + i + " = " + numbers[i]);
        }

        sc.close();
    }
}