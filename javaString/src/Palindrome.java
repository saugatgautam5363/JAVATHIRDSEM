import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scanner.next();

        String reversed = new StringBuilder(input).reverse().toString();

        if(input.equals(reversed)){
            System.out.println("Palindrome String");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}
