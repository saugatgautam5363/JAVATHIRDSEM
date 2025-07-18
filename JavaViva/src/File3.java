import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class File3 {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("File.text");
            ObjectInputStream obj = new ObjectInputStream(file);

            try {
                File1 s = (File1) obj.readObject();
                System.out.println("Name: "+s.name);
                System.out.println("Age: "+s.age);

            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }
            obj.close();
            file.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
