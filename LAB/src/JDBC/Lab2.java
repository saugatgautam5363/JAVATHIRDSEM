package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Lab2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/school"; // Adjust host/port if needed
        String username = "root"; // Replace with your MySQL username
        String password = "";     // Replace with your MySQL password

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected successfully.");

            Statement stmt = conn.createStatement();

            String sql = "INSERT INTO students (name, age) VALUES ('saugat gautam', 20)";
            int rowsInserted = stmt.executeUpdate(sql);

            if (rowsInserted > 0) {
                System.out.println("A new student was inserted successfully!");
            }

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

