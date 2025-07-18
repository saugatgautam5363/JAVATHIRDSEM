import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class File2 {
    public static void main(String[] args) {
        try{
            File1  file1 = new File1("Saugat",101);
        FileOutputStream file = new FileOutputStream("File.text");
            ObjectOutputStream obj = new ObjectOutputStream(file);
            obj.writeObject(file1);

            file.close();
            obj.close();
            System.out.println("Serialization successfully");
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
}
