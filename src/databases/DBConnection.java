package databases;

import java.io.IOException;
import java.sql.*;

public class DBConnection {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/classicmodels";

    // Database credentials
    static final String USER = "root";
    static final String PASS = ""; //add your password

    public static void main(String[] args) {


        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            System.out.println("Connecting to database...");
            Connection conn =  DriverManager.getConnection(DB_URL, USER, PASS);

            // Execute a query
            System.out.println("Creating statement...");
            Statement stmt =  conn.createStatement();
            String sql;
            //search for two more columns of your choice from employees table
            sql = "SELECT lastName, firstName, email FROM employees";
            ResultSet rs = stmt.executeQuery(sql);

            // Process the result set
            while (rs.next()) {
                // Retrieve by column name
                String lastName = rs.getString("lastName");
                String firstName = rs.getString("firstName");
                String email = rs.getString("email");


                // Display values
                System.out.print("lastName: " + lastName);
                System.out.print(", firstName: " + firstName);
                System.out.println(", email: " + email);
            }

            // Insert a record
            System.out.println("Inserting a record...");
            //insert a value using your own record
            // example: "INSERT INTO employees (employeeNumber, lastName, firstName, email, extension, officeCode,jobTitle) VALUES (1001,'Ahmed', 'Monsur', 'email@email.com','x7546',1,'Press Secretary')";
            sql ="" ;
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
            System.out.println("Goodbye!");
        }
    }

}
