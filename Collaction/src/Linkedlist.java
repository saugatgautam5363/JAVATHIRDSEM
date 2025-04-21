import java.util.LinkedList;
import java.util.*;

public class Linkedlist {


        public static void main(String[] args) {
           List<Integer> numbers = new LinkedList<>();

            for (int i = 0; i < 10; i++) {
                numbers.add(i);
            }

            numbers.remove(5);
            numbers.remove(2);

            numbers.forEach(num -> {
                System.out.println("num " + num);
            });


            System.out.println("If includes 4 : " + numbers.contains(4));

        }
    }
