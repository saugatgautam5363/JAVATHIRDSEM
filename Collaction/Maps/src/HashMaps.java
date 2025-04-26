import java.util.*;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(2,"SAUGAT");
        map.put(1,"SANTOSH");
        map.put(9,"ACHYUT");
        map.put(7,"BISHAL");
        System.out.println(map);

        String s = map.get(36);
        System.out.println(s);


        System.out.println(map.containsKey(34));
        System.out.println(map.containsValue("SAUGAT"));

        Set<Integer> keys = map.keySet();
        for(int i : keys){
            System.out.print(map.get(i)+" ");
        }
    }
}
