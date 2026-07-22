import java.util.Scanner;

public class AverageOfTwoIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Type casting to get the average as a decimal value
        double average = (double) (num1 + num2) / 2;

        System.out.println("Average = " + average);

        sc.close();
    }
}