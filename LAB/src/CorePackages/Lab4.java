package CorePackages;

import java.util.Hashtable;
import java.util.Enumeration;

public class Lab4 {
    public static void main(String[] args) {
        // Create a Hashtable to store student roll numbers and names
        Hashtable<Integer, String> students = new Hashtable<>();

        // Add key-value pairs
        students.put(101, "Saugat");
        students.put(102, "Aarav");
        students.put(103, "Sneha");
        students.put(104, "Riya");

        // Get keys using Enumeration
        Enumeration<Integer> keys = students.keys();

        System.out.println("Student Roll Numbers and Names:");
        while (keys.hasMoreElements()) {
            Integer rollNo = keys.nextElement();
            String name = students.get(rollNo);
            System.out.println("Roll No: " + rollNo + ", Name: " + name);
        }
    }
}

