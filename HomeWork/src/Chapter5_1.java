class NegativeDenominatorException extends Exception {
    public NegativeDenominatorException(String message) {
        super(message);
    }
}
public class Chapter5_1 {
    static int divide(int numerator, int denominator) throws NegativeDenominatorException {
        if (denominator < 0) {
            throw new NegativeDenominatorException("Denominator cannot be negative.");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NegativeDenominatorException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        try {
            denominator = -5;
            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NegativeDenominatorException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
}

