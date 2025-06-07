import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList();
        name.add("Saugat");
        name.add("RAj");
        name.add("Sandesh");

        for(String names: name){
            System.out.println(names);
        }
    }
}
