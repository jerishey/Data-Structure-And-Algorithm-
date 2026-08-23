import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentFile {

    public static void main(String[] args) {

        String fileName = "student.txt";

        // Create and write to file
        try {
            File file = new File(fileName);

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            FileWriter writer = new FileWriter(file);

            writer.write("----- Student Information -----\n");
            writer.write("Name: Rakesh\n");
            writer.write("Course: BCA\n");
            writer.write("Language: Java\n");
            writer.write("Topic: File Handling\n");

            writer.close();

            System.out.println("Data written successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }


        // Read from file
        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);

            System.out.println("\n----- Reading File -----");

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while reading: "
                    + e.getMessage());
        }
    }
}