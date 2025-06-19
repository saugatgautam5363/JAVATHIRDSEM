package IOSTreams;

import java.io.*;

// Step 1: Define a Serializable class
class Student implements Serializable {
    private static final long serialVersionUID = 1L; // Recommended for Serializable classes

    String name;
    int rollNo;

    // Constructor
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

public class Lab5 {
    public static void main(String[] args) {
        String filename = "student.ser";

        // Step 2: Create and serialize a Student object
        Student student1 = new Student("Saugat", 101);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(student1);
            System.out.println("Object has been serialized to " + filename);
        } catch (IOException e) {
            System.out.println("Serialization error:");
            e.printStackTrace();
        }

        // Step 3: Deserialize the object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Student deserializedStudent = (Student) ois.readObject();
            System.out.println("\nDeserialized Student Object:");
            deserializedStudent.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error:");
            e.printStackTrace();
        }
    }
}

