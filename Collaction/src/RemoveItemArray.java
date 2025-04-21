import java.util.ArrayList;
import java.util.List;

public class RemoveItemArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(58);
        list.add(40);

        list.remove(1);
        System.out.println(list);
    }
}
