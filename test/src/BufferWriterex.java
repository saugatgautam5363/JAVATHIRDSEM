import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterex {
    public static void main(String[] args) {
        try {
        BufferedWriter bw = new BufferedWriter(new FileWriter("File.text"));
        bw.write("Hello i am saugat gautam");
        bw.close();
            System.out.println("File write successfully!!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
