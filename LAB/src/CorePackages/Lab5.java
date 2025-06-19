package CorePackages;

import java.util.Random;

public class Lab5
{
    public static void main(String[] args) {
        Random random = new Random();

        // Generate 10 random integers between 1 and 50
        System.out.println("10 Random Integers Between 1 and 50:");
        for (int i = 0; i < 10; i++) {
            int randInt = random.nextInt(50) + 1; // 1 to 50
            System.out.print(randInt + " ");
        }

        System.out.println("\n\nRolling a six-sided die 5 times:");
        for (int i = 1; i <= 5; i++) {
            int dieRoll = random.nextInt(6) + 1; // 1 to 6
            System.out.println("Roll " + i + ": " + dieRoll);
        }
    }
}

