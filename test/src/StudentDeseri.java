import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class StudentDeseri {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("File.txt");
            ObjectInputStream obj = new ObjectInputStream(file);

            STudent s1 = (STudent)  obj.readObject();

            System.out.println("Name: "+s1.name);
            System.out.println("Roll: "+s1.roll);
            System.out.println("Subject: "+s1.subject);

            obj.close();;
            file.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
