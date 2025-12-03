package studentmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
//utility class
	
    private static final String url = "jdbc:mysql://localhost:3306/jdbcdemo";
    private static final String user = "root";
    private static final String pass = "lohani";
 

    // Method to get database connection
    public static Connection getConnection() {
        Connection con = null;

        try {
            // Step 1: Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish Connection
            con = DriverManager.getConnection(url, user, pass);

            System.out.println("Database Connected Successfully!");

        } catch (Exception e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
        }

        return con;
    }

}