import java.util.Collections;
import java.util.Stack;

import static javax.swing.UIManager.get;

public class Reverse {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("hello");
        Collections.reverse(stack);
        System.out.println("Reverse: "+stack);
    }
}
