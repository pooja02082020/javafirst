package simpledbproject;

import java.sql.*;

public class DBConnection {

    private static Connection con;

    public static Connection getConnection() {

        if (con == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/studentdb",
                        "root",
                        "lohani"
                );
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return con;
    }
}
