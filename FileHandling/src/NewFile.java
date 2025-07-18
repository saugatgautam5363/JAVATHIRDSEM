import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NewFile {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("File.text"))){
            String line;
            while ((line = bufferedReader.readLine())!= null){
                System.out.println(line);
            }
            } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
