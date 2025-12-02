package jdbc;

import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String user = "root";
		String pass = "lohani";
		try {
			
			//Drivername
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //represents a session in db
            Connection con = DriverManager.getConnection(url, user, pass);

            //preparing the statement
            String query = "SELECT * FROM student";
            PreparedStatement ps = con.prepareStatement(query);
            
            //holds the result
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
            }
            //close the connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}