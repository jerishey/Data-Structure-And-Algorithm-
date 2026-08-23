import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

    public static void main(String[] args) {

        String fileName = "student.txt";

        // Writing to the file
        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(fileName)
            );

            writer.write("Name: Rakesh");
            writer.newLine();

            writer.write("Course: BCA");
            writer.newLine();

            writer.write("Subject: Java");
            writer.newLine();

            writer.close();

            System.out.println("Data written successfully!");

        } catch (IOException e) {
            System.out.println("Writing Error: " + e.getMessage());
        }


        // Reading from the file
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(fileName)
            );

            String line;

            System.out.println("\nReading data from file:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Reading Error: " + e.getMessage());
        }
    }
}