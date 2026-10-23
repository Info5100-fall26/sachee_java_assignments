package edu.neu.mgen;

import java.sql.*;

public class DatabaseTest {
    public static void main(String[] args) throws Exception {

        // Connect to SQLite database
        Connection con = DriverManager.getConnection(
            "jdbc:sqlite:students.db"
        );

        Statement st = con.createStatement();

        // Create table
        st.executeUpdate(
            "CREATE TABLE IF NOT EXISTS students " +
            "(id INTEGER PRIMARY KEY, name TEXT, age INTEGER)"
        );

        // Add sample record if missing
        st.executeUpdate(
            "INSERT OR IGNORE INTO students VALUES (1, 'John', 22)"
        );

        con.setAutoCommit(false);

        // Read record
        ResultSet rs = st.executeQuery(
            "SELECT * FROM students WHERE id = 1"
        );

        if (rs.next()) {
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("Age: " + rs.getInt("age"));
        }
        rs.close();

        // Modify record
        st.executeUpdate(
            "UPDATE students SET age = 25 WHERE id = 1"
        );
        System.out.println("Age updated to 25");

        // Rollback
        con.rollback();
        System.out.println("Rollback completed");

        // Verify rollback
        rs = st.executeQuery(
            "SELECT age FROM students WHERE id = 1"
        );

        if (rs.next()) {
            System.out.println("Age after rollback: "
                + rs.getInt("age"));
        }
        rs.close();

        // Update again
        st.executeUpdate(
            "UPDATE students SET age = 23 WHERE id = 1"
        );

        con.commit();
        System.out.println("Final age updated to 23");

        st.close();
        con.close();
    }
}
