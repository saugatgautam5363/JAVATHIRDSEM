package Collection;

import java.util.LinkedList;
import java.util.Iterator;

public class Lab4 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(22);
        Iterator<Integer> iterator = numbers.iterator();

        System.out.println("Even numbers in the list:");

        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
