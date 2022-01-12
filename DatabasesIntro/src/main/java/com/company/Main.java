package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Connecting to database...");
        Connection connection = getConnection(); // Saving connection to a variable

        PreparedStatement ps;
        ResultSet rs;

        // Shortcut for try/catch is ctrl+alt+t
        try {

            /*ps = connection.prepareStatement("INSERT INTO animals(id, name, sound) VALUES(6, 'wolf', 'awooo')");
            ps.execute();
            System.out.println("Successfully added animal");*/

            ps = connection.prepareStatement("SELECT * FROM animals WHERE name='wolf'");
            rs = ps.executeQuery();

            // Declare variables to hold the data you'll be getting from the result set
            int id;
            String name, sound;

            System.out.println("ID\t name\t sound\t");

            while (rs.next()) {
                id = rs.getInt("id");
                name = rs.getString("name");
                sound = rs.getString("sound");

                System.out.println(id + "\t " + name + "\t " + sound + "\t ");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to connect to the database that returns the connection.
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testrun", "root", "8WHe:$.}JvTwYZ>L");
            System.out.println("Database connected successfully");
        } catch (SQLException e) {
            //System.out.println("Unable to connect to database");
            e.printStackTrace();
        }
        return connection;
    }
}
