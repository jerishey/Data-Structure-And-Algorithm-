import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWrite {

    public static void main(String[] args) {

        String fileName = "data.txt";

        // ---------------- WRITE TO FILE ----------------
        try {
            FileWriter writer = new FileWriter(fileName);

            writer.write("Hello, Buddy!\n");
            writer.write("This is a Java File Handling example.\n");
            writer.write("Java can write data into a file.");

            writer.close();

            System.out.println("Data written successfully!");

        } catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }


        // ---------------- READ FROM FILE ----------------
        try {
            FileReader reader = new FileReader(fileName);

            int character;

            System.out.println("\nData from file:");

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }
    }
}