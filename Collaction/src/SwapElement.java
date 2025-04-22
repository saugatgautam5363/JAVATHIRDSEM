import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(9);
        System.out.println(list);
        Collections.swap(list,1,0);
        System.out.println(list);
    }
}
