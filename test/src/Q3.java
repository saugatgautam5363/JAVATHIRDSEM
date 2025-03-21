class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Person name is " + name);
        System.out.println("Person age is " + age);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Person display = new Person("saugat", 18);
        display.displayDetails();
    }
}

