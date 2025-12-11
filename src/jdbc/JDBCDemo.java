package jdbc;

import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) throws SQLException {
		//FOR DATABASE CONNECTION
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String user = "root";
		String pass = "lohani";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		System.out.println(con.getAutoCommit());
		con.setAutoCommit(false);
		
		try {

			// Drivername
			Class.forName("com.mysql.cj.jdbc.Driver");

			// represents a session in db
			
			// preparing the statement
			String query = "SELECT * FROM student";
			PreparedStatement ps = con.prepareStatement(query);

			// holds the result
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
			}

//            //Insert query
			String query1 = "Insert into student(id,name) values(?,?)";
			PreparedStatement ps1 = con.prepareStatement(query1);
////            ps1.setInt(1,7);
////            ps1.setString(2, "Test1");
//			ps1.executeUpdate();

			// update
			String query2 = "Update student set name =? where id = ?";
			PreparedStatement ps2 = con.prepareStatement(query2);
			ps2.setString(1, "Test 2");
			ps2.setInt(2, 3);
			ps2.executeUpdate();

			// delete
			String query3 = "Delete from student where id = ?";
			PreparedStatement ps3 = con.prepareStatement(query3);
//			//ps3.setInt(1, 3);
//			ps3.executeUpdate();
			
			con.commit();
			
			// close the connection
			con.close();

		} catch (Exception e) {
			con.rollback();
			e.printStackTrace();
		}
	}
}