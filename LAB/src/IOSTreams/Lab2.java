package IOSTreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class Lab2 {
    public static void main(String[] args) {
        String data = "Hello Byte Stream";
        try {
            FileOutputStream fos = new FileOutputStream("byte_output.txt");
            fos.write(data.getBytes()); // Convert string to bytes
            fos.close();
            System.out.println("Data written using Byte Stream.");
        } catch (IOException e) {
            System.out.println("An error occurred during byte stream write.");
            e.printStackTrace();
        }
    }
}
