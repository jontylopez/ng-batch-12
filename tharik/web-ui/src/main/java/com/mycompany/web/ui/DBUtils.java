/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.web.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hd
 */
public class DBUtils {

    static final String DB_URL = "jdbc:mysql://localhost:3306/batch12";
    static final String USER = "root";
    static final String PASS = "";
    static final String QUERY = "SELECT * FROM students";

    public List<Student> getStudents() throws ClassNotFoundException {
        List<Student> students = new ArrayList<>();
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(QUERY);) {
            while (rs.next()) {
                students.add(new Student(rs.getInt("id"), rs.getString("name")));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }
}
