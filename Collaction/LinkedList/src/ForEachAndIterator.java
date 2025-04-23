import java.util.Iterator;
import java.util.LinkedList;

public class ForEachAndIterator {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(7);
        linkedList.add(20);
        linkedList.add(42);
        linkedList.add(33);
        linkedList.add(40);
        linkedList.add(45);
        System.out.println("For-each: ");
        for (int list: linkedList){
            System.out.print(list+" ");
        }

        Iterator<Integer> iterator = linkedList.iterator();
        System.out.println("\nIterator: ");
        while(iterator.hasNext()){
            int list = iterator.next();
            System.out.print(list+" ");
        }
    }
}
