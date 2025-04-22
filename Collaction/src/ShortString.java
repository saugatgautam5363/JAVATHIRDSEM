import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class ShortString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Saugat");
        list.add("Santosh");
        list.add("Alisha");
        list.add("Achyut");

        System.out.println("Before the Shorting: ");
        System.out.println(list);

        Collections.sort(list);
        System.out.println("After Shorting: ");
        System.out.println(list);
    }
    }