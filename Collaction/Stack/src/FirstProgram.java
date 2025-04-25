import java.util.Stack;

public class FirstProgram {
    public static Stack<Integer> Function(int[] element) {
        Stack<Integer> stack1 = new Stack<>();

        for(int elements : element){
            stack1.push(elements);
        }
        return stack1;
    }

    public static void main(String[] args) {
        int[] number = {12,34,4,78};
        Stack<Integer> stack = Function(number);

        System.out.println("Element: "+stack);
    }
}