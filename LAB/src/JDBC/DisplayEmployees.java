package JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayEmployees {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://127.0.0.1:3306/company";
        String dbUser = "root";
        String dbPassword = "admin";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

            String sql = "SELECT id, name, address, designation, salary FROM employee";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Employee Details:");
            System.out.println("---------------------------------------------------------");
            System.out.printf("%-5s %-20s %-25s %-15s %-10s\n", "ID", "Name", "Address", "Designation", "Salary");
            System.out.println("---------------------------------------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                String designation = rs.getString("designation");
                double salary = rs.getDouble("salary");

                System.out.printf("%-5d %-20s %-25s %-15s %-10.2f\n",
                        id, name, address, designation, salary);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
