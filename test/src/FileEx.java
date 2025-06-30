import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        File file = new File("File.txt");
        if(file.exists()) {
            System.out.println(file.getName());
            System.out.println(file.length());
            System.out.println(file.canWrite());
            System.out.println(file.canExecute());
        }else {
            System.out.println("File is not found!!");
        }
    }
}
