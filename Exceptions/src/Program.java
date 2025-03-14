import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a Number: ");
            int number = scanner.nextInt();

            System.out.println("Enter the divide Number: ");
            int numbr1 = scanner.nextInt();

            int result = number / numbr1;
            System.out.println("Result: " + result);
        }catch (ArithmeticException e){
            System.out.println("You cannot divide by zero!!");
        }catch (InputMismatchException e){
            System.out.println("OHH😯❗ Please Enter the Number");
        }
        finally {
            System.out.println("Your Program allows Run✅");
        }
    }
}