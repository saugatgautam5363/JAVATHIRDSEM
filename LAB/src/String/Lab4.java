package String;

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String modifiedString = input.replaceAll("(?i)[aeiou]", "*");

        System.out.println("Modified string: " + modifiedString);

        scanner.close();
    }
}
