import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreams1 {
    public static void main(String[] args) throws IOException {
        InputStream f = new FileInputStream("File.text");
        String line;
        while ((line = String.valueOf(f.read()))!= null){
            System.out.println(line);
        }
    }
}
