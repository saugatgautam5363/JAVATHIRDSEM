import java.io.File;
import java.io.IOException;

public class CreateNewFile {
    public static void main(String[] args) {
        File newFile = new File("File.txt");
        try{
                newFile.createNewFile();
            } catch (IOException e) {
            System.out.println("Unable to create a file");
            e.printStackTrace();
            }
        }
    }
