import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        // Taking input
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int sum = 0;
        int largest = numbers[0];
        int smallest = numbers[0];

        // Processing array
        for (int number : numbers) {
            sum += number;

            if (number > largest) {
                largest = number;
            }

            if (number < smallest) {
                smallest = number;
            }
        }

        double average = (double) sum / n;

        // Display results
        System.out.println("\nArray Elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\n\nSum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);

        sc.close();
    }
}