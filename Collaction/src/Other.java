import java.util.LinkedList;
import java.util.List;

public class Other {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();

        for (int i = 0; i < 17; i++) {
            strings.add("sauagt"+i);
        }
        strings.remove(5);
        strings.remove(9);

        strings.forEach(string ->{
            System.out.println("String: "+string);
        });
        System.out.println("If includes 4 : " + strings.contains(4));
    }
}
