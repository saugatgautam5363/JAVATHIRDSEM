import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticException1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;

            System.out.println("Result = " + result);

        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            scanner.close();
        }
    }
}
