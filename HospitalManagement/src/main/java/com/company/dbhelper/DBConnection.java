package com.company.dbhelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "8WHe:$.}JvTwYZ>L");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
