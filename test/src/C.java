import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class C {
    public static void main(String[] args) {
        try {
        BufferedReader br = new BufferedReader(new FileReader("File.text"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("Student.ser"));

            String line;

            while ((line = br.readLine()) != null){
                bw.write(line);
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
