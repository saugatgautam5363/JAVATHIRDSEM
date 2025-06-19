package CorePackages;

public class Lab1 {
    public static void main(String[] args) {
        // Generate a random double between 0 and 100
        double randomValue = Math.random() * 100;
        System.out.println("Random value: " + randomValue);

        // Round the value
        long roundedValue = Math.round(randomValue);
        System.out.println("Rounded value: " + roundedValue);

        // Calculate the square root
        double sqrtValue = Math.sqrt(randomValue);
        System.out.println("Square root: " + sqrtValue);

        // Calculate sine (convert to radians first)
        double radians = Math.toRadians(randomValue);
        double sineValue = Math.sin(radians);
        System.out.println("Sine (in radians): " + sineValue);
    }
}

