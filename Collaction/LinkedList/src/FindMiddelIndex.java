import java.util.LinkedList;

public class FindMiddelIndex {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(45);
        linkedList.add(9);
        linkedList.add(77);
        linkedList.add(45);
        linkedList.add(23);
        linkedList.add(43);

       int middleIndex = linkedList.size()/2;

        System.out.println("MiddleIndex : "+linkedList.get(middleIndex));
    }
}
