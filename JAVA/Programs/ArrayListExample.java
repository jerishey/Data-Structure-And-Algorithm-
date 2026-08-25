import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Print the ArrayList
        System.out.println("Fruits: " + fruits);

        // Access an element
        System.out.println("First fruit: " + fruits.get(0));

        // Update an element
        fruits.set(1, "Mango");
        System.out.println("After update: " + fruits);

        // Remove an element
        fruits.remove("Orange");
        System.out.println("After removal: " + fruits);

        // Check size
        System.out.println("Size: " + fruits.size());

        // Loop through the ArrayList
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}