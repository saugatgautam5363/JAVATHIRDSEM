import java.util.LinkedList;

public class FirstProgram {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList = new LinkedList<>();
        linkedList.add(34);
        linkedList.add(47);
        linkedList.add(43);
        linkedList.addFirst(5);
        linkedList.add(3,45);
        linkedList.remove();
        linkedList.remove(4);

        System.out.println(linkedList+" ");
    }
}
