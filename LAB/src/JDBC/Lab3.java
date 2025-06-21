package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Lab3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/school"; // Database URL
        String username = "root"; // Replace with your DB username
        String password = "admin";     // Replace with your DB password

        try {
            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected successfully.");

            // Create statement and execute query
            Statement stmt = conn.createStatement();
            String sql = "SELECT name, age FROM students";
            ResultSet rs = stmt.executeQuery(sql);

            // Print all student records
            System.out.println("Student Records:");
            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("Name: " + name + ", Age: " + age);
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error.");
            e.printStackTrace();
        }
    }
}

