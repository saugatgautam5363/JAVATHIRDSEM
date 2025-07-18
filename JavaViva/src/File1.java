import java.io.Serializable;

public class File1 implements Serializable {
    int age;
    String name;
    File1(String name,int age){
        this.age = age;
        this.name = name;
    }
}
