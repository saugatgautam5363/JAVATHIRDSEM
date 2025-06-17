import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentSeri {
    public static void main(String[] args) {
         STudent s1 = new STudent("saugat",101,"Java");

        try {
            FileOutputStream file = new FileOutputStream("File.txt");
            ObjectOutputStream obj = new ObjectOutputStream(file);

            obj.writeObject(s1);
            file.close();
            obj.close();
            System.out.println("Object serialization Successfully!!");
        } catch ( Exception e) {
            throw new RuntimeException(e);
        }
    }
}
