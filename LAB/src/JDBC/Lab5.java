package JDBC;

import java.sql.*;

public class Lab5 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/school"; // Change port/db if needed
        String user = "root"; // Your MySQL username
        String password = "admin"; // Your MySQL password

        String query = "SELECT name FROM students";


        try (
                Connection conn = DriverManager.getConnection(url, user, password);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query)
        ) {
            System.out.println("Connected to the database.");
            System.out.println("Student Names:");

            while (rs.next()) {
                String name = rs.getString("name");
                System.out.println("- " + name);
            }

        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }
    }
}

