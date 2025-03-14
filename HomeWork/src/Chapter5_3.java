import java.util.Scanner;

// Step 1: Define a custom exception class
class invalidageexception extends Exception {
    public invalidageexception(String message) {
        super(message);
    }
}

public class Chapter5_3 {
    static void validateAge(int age) throws invalidageexception {
        if (age < 18) {
            // Throw custom exception if age is less than 18
            throw new invalidageexception("Invalid Age: You must be 18 or older to proceed.");
        } else {
            System.out.println("You are eligible to proceed!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Step 3: Ask user for age input
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Step 4: Validate age
            validateAge(age);

        } catch (invalidageexception e) {
            // Step 5: Catch and handle custom exception
            System.out.println("Exception Caught: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Close scanner to prevent resource leaks
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}

