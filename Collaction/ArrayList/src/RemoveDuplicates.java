import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(23);
        number.add(56);
        number.add(8);
        number.add(8);
        number.add(9);

       LinkedHashSet<Integer> set = new LinkedHashSet<>(number);




       ArrayList<Integer> numbers = new ArrayList<>(set);
        System.out.println("Original numbers: "+number);
        System.out.println("Remove numbers: "+numbers);
    }
}
