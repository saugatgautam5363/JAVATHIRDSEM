import java.io.*;

public class Copyfilecontent {
    public static void main(String[] args) {
        try {
        BufferedReader br = new BufferedReader(new FileReader("File.text"));

            BufferedWriter bw = new BufferedWriter(new FileWriter("Student.ser"));
            String line;
            while((line = br.readLine())!= null){
                bw.write(line);
                bw.newLine();
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
