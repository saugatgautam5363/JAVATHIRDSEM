import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MeargeTowArray {
    public static void main(String[] args) {
        List<Integer>arrayList1 = new ArrayList<>();
        List<Integer>arrayList2 = new ArrayList<>();
        arrayList1.add(4);
        arrayList1.add(7);
        arrayList1.add(0);
        System.out.println("First Array: "+arrayList1);
        arrayList2.add(8);
        arrayList2.add(0);
        arrayList2.add(45);
        arrayList2.add(4);
        System.out.println("Second array: "+arrayList2);
        arrayList1.addAll(arrayList2);
        System.out.println("After Marge: ");
        System.out.println(arrayList1);
    }
}
