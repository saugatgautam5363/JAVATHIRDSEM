import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopAnditerator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Car");
        list.add("Year");
        list.add("Apple");
        list.add("Banana");
        // using the loop
        System.out.println("Using Loop: ");
        for(int i = 0;i< list.size();i++){
            System.out.println(list.get(i));
        }
        //using the for each
        System.out.println("Using For-each loop: ");
        for(String arraylist : list){
            System.out.println(arraylist);
        }
        //Using Iteration
        System.out.println("Using Iteration: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
