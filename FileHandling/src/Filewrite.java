import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {

    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("File.txt")) {
            writer.write("Hello, Java file handling!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
