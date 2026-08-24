import java.util.Scanner;

public class ArraySwap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nOriginal Array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        // Reverse array using swapping
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            // Swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("\n\nArray after swapping:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}