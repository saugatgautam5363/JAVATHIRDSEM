import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String Value: ");
        try{
            String string = scanner.nextLine();
            System.out.println("Integer value: "+Integer.parseInt(string));
        }catch (NumberFormatException e){
            System.out.println("Envalid exception!!");
        }


    }
}
