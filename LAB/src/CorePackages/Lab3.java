package CorePackages;

import java.util.Vector;
import java.util.Stack;

public class Lab3 {
    public static void main(String[] args) {
        // Create a Vector of Integers and add 5 numbers
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Vector Elements:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Create a Stack of Strings
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        System.out.println("\nStack Elements (Popped):");
        while (!stack.empty()) {
            System.out.println(stack.pop()); // LIFO behavior
        }
    }
}

