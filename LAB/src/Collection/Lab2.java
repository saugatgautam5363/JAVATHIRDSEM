package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lab2 {
    public static void main(String[] args) {
        // Create a List and add duplicate values
        List<String> nameList = new ArrayList<>();
        nameList.add("Saugat");
        nameList.add("gautam");
        nameList.add("Santosh");
        nameList.add("gautam");


        Set<String> nameSet = new HashSet<>(nameList);

        System.out.println("List (allows duplicates):");
        for (String name : nameList) {
            System.out.println(name);
        }

        System.out.println("\nSet (unique values only):");
        for (String name : nameSet) {
            System.out.println(name);
        }
    }
}

