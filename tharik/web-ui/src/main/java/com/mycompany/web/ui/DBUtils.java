package com.mycompany.web.ui;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtils {

    static final String DB_URL = "jdbc:mysql://localhost:3306/batch12";
    static final String USER = "root";
    static final String PASS = "";
    static final String QUERY = "SELECT * FROM students";

    public List<Student> getStudents() throws ClassNotFoundException {
        List<Student> students = new ArrayList<>();
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); 
             Statement stmt = conn.createStatement(); 
             ResultSet rs = stmt.executeQuery(QUERY);) {
            while (rs.next()) {
                students.add(new Student(rs.getInt("id"), rs.getString("name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }

    // Get a specific student by ID
    public Student getStudent(int id) {
        String query = "SELECT * FROM students WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(query);) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new Student(rs.getInt("id"), rs.getString("name"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // Return null if student with that ID is not found
    }

    // Add a new student
    public boolean addStudent(Student st) {
        String query = "INSERT INTO students (id, name) VALUES (?, ?)";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(query);) {
            pstmt.setInt(1, st.getId());
            pstmt.setString(2, st.getName());
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0; // Return true if insert is successful
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Update an existing student
    public boolean updateStudent(Student st) {
        String query = "UPDATE students SET name = ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(query);) {
            pstmt.setString(1, st.getName());
            pstmt.setInt(2, st.getId());
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0; // Return true if update is successful
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Delete a student by ID
    public boolean deleteStudent(int id) {
        String query = "DELETE FROM students WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(query);) {
            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0; // Return true if delete is successful
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
