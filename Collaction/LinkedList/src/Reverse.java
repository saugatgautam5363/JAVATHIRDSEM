import java.util.Collections;
import java.util.LinkedList;

public class Reverse {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);
        System.out.println("Original LinkedList: "+linkedList);
        Collections.reverse(linkedList);
        System.out.println("Reverse integer: "+linkedList);
    }
}
