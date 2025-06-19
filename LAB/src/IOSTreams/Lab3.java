package IOSTreams;

import java.io.FileWriter;
import java.io.IOException;

public class Lab3 {
    public static void main(String[] args) {
        String data = "Hello Character Stream";
        try {
            FileWriter fw = new FileWriter("char_output.txt");
            fw.write(data); // Directly writes string
            fw.close();
            System.out.println("Data written using Character Stream.");
        } catch (IOException e) {
            System.out.println("An error occurred during character stream write.");
            e.printStackTrace();
        }
    }
}
