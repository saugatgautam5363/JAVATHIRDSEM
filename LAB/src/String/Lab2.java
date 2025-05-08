package String;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character to count: ");
        char targetChar = scanner.next().charAt(0);

        int count = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == targetChar) {
                count++;
            }
        }

        System.out.println("The character '" + targetChar + "' appears " + count + " times.");

        scanner.close();
    }
}
