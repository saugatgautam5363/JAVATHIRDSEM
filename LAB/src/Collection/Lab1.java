package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Lab1 {
    public static void main(String[] args) {
        // Create an ArrayList and add 5 integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(5);
        numbers.add(42);
        numbers.add(17);
        numbers.add(8);

        // Sort the ArrayList in ascending order
        Collections.sort(numbers);

        // Display the sorted list
        System.out.println("Sorted numbers in ascending order:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

