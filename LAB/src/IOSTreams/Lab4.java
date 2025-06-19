package IOSTreams;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Lab4 {
    public static void main(String[] args) {
        String fileName = "example.txt";

        // Step 1: Write multiple lines into the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("This is the first line.");
            writer.newLine();
            writer.write("Here comes the second line.");
            writer.newLine();
            writer.write("Finally, this is the third line.");
            System.out.println("File written successfully.\n");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }

        // Step 2: Read and print each line from the file
        System.out.println("Reading from file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each line
            }
        } catch (IOException e) {
            System.out.println("Error reading from file.");
            e.printStackTrace();
        }
    }
}
