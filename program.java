
class Animal{
    String name;
    int age;

    public void sleep(){
        System.out.println(name +" sleep" );
    }
}
class Dog extends Animal{

    public  void sleep(){
        super.sleep();
    }
}

public class program {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.name = "Dog";

        dog.sleep();
    }

}
