package studentmanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
//_DataAccessObject

	public boolean insertStudent(Student s) {

		// create
		String query = "Insert into student(name,email,marks) values(?,?,?)";
		try (Connection con = DBConnection.getConnection()) {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, s.getName());
			ps.setString(2, s.getEmail());
			ps.setInt(3, s.getMarks());

			return ps.executeUpdate() > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	public List<Student> getAllStudents() {

		List<Student> list = new ArrayList<>();

		// read
		String query = "Select * from student";
		try (Connection con = DBConnection.getConnection()) {
			PreparedStatement ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Student s = new Student(rs.getInt("id"), rs.getString("name"), rs.getString("email"),
						rs.getInt("marks"));
				list.add(s);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}

	public boolean updateStudent(Student s) {

		// update
		String query = "update student set name =? ,email =? ,marks =? where id =?";
		try (Connection con = DBConnection.getConnection()) {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, s.getName());
			ps.setString(2, s.getEmail());
			ps.setInt(3, s.getMarks());
			ps.setInt(4, s.getId());
			return ps.executeUpdate() > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	public boolean deleteStudent(Student s) {

		// delete
		String query = "Delete  from student where id =?";
		try (Connection con = DBConnection.getConnection()) {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, s.getId());

			return ps.executeUpdate() > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

}
