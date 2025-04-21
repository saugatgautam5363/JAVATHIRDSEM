import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<Integer> list = new java.util.ArrayList<>();
        list.add(45);
        list.add(18);
        list.add(7);

        int min = Collections.min(list);
        int max = Collections.max(list);

        System.out.println("Minimum value: "+min);
        System.out.println("Maximum value: "+max);
    }
}
