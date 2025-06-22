import java.util.Scanner;

public class AgeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter the age: ");
            int age = scanner.nextInt();


            if(age < 0 || age<18){
                throw new InvalidException("Invalid age");
            }
            System.out.println("Access granted. Age is valid.");
        }catch(InvalidException e){
            System.out.println("Custom exception: "+e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            scanner.close();
        }
    }
}
