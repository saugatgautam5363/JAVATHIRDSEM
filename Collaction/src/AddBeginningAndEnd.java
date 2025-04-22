import java.util.ArrayList;
import java.util.List;

public class AddBeginningAndEnd {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        list.add(34);
        list.add(45);
        list.add(18);
        System.out.println("Original element: ");
        System.out.println(list);
        list.addFirst(39);
        list.addLast(98);
        System.out.println("After Add element First and Last: ");
        System.out.println(list);
    }
}
