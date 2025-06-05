package Collection;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class Lab3 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("Saugat");
        hashSet.add("gautam");
        hashSet.add("santosh");

        treeSet.addAll(hashSet);

        System.out.println("HashSet (unordered):");
        for (String name : hashSet) {
            System.out.println(name);
        }

        System.out.println("\nTreeSet (sorted):");
        for (String name : treeSet) {
            System.out.println(name);
        }
    }
}
