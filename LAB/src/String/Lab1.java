package String;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        String combinedString = firstString + secondString;

        String upperCaseString = combinedString.toUpperCase();

        System.out.println("Concatenated and Uppercase String: " + upperCaseString);

        scanner.close();
    }
}
