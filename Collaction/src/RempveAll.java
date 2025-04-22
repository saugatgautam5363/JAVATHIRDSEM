import java.util.ArrayList;
import java.util.Collections;

public class RempveAll {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Saugat");
        list.add("Achyut");
        list.add("Bishal");
        System.out.println("Before the remove All: ");
        System.out.println(list);
        System.out.println("After the remove All: ");
        list.removeAll(list);
        System.out.println(list);
    }
}
