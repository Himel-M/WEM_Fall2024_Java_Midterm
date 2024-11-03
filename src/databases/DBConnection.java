package databases;

import java.io.IOException;
import java.sql.*;

public class DBConnection {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {}
     public static void DBConnection(){
        Connection conn = null;
        Statement stmt = null;


        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            // Please input your own username and password
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pnt", "", "");

            // Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            // Please write a SQL query to first_name, last_name and email values from employees table
            sql = "";
            ResultSet rs = stmt.executeQuery(sql);

            // Process the result set
            while (rs.next()) {
                // Retrieve by column name
                String first_name = rs.getString("");
                String last_name = rs.getString("");
                String  email = rs.getString("");

                // Display values

                System.out.print("FirstName: \n" + first_name);
                System.out.print(", \nLastName: \n" + last_name);
                System.out.print(", \nEmail:" + email);

                System.out.println("\n------------------------------------------------------------------");
            }

            // Insert five record into the employees table
            System.out.println("Inserting a record...");
            sql = "INSERT INTO .... complete the statement" +
                    " VALUES ..... complete the statement";


            stmt.executeUpdate(sql);
            System.out.println("Record inserted successfully.");

            // Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // Finally block used to close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            } // nothing we can do
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
