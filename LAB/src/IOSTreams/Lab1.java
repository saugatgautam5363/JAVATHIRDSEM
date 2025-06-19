package IOSTreams;


import java.io.File;
import java.io.IOException;

public class Lab1 {
    public static void main(String[] args) {
        // Define the directory and file names
        String dirName = "MyData";
        String fileName = "info.txt";

        // Create File object for directory
        File directory = new File(dirName);

        // Check if directory exists
        if (!directory.exists()) {
            // Try to create the directory
            if (directory.mkdir()) {
                System.out.println("Directory 'MyData' created successfully.");
            } else {
                System.out.println("Failed to create directory 'MyData'.");
                return;
            }
        } else {
            System.out.println("Directory 'MyData' already exists.");
        }

        // Create File object for file inside directory
        File file = new File(directory, fileName);

        // Check if file exists, and create it if not
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("File 'info.txt' created successfully inside 'MyData'.");
                } else {
                    System.out.println("Failed to create 'info.txt'.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred while creating 'info.txt'.");
                e.printStackTrace();
            }
        } else {
            System.out.println("File 'info.txt' already exists inside 'MyData'.");
        }
    }
}
