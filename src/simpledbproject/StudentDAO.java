package simpledbproject;

import java.sql.*;
import java.util.*;

public class StudentDAO {

    public boolean insertStudent(Student s) {
        String sql = "INSERT INTO students(name, email, marks) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setInt(3, s.getMarks());

            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();

        String sql = "SELECT * FROM students";

        try {
            PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                Student s = new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getInt("marks")
                );
                list.add(s);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return list;
    }
}
