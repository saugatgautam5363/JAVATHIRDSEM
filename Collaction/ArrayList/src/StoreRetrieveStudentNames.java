import java.util.ArrayList;
import java.util.Scanner;

public class StoreRetrieveStudentNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studentsName = new ArrayList<>();

        System.out.println("How many students do you want to add? ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 1;i<=n;i++){
            System.out.print("Enter the student name "+ i +": ");
            String name = scanner.nextLine();
            studentsName.add(name);
        }
        System.out.println();
        System.out.println("Display the student list:");
        for(int i = 0;i<studentsName.size();i++){
            System.out.println(i+1+ ". "+studentsName.get(i));
        }
        scanner.close();
    }
}
