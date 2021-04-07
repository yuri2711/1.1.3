package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String url = "jdbc:mysql://localhost:3306/sakila?autoReconnect=true&useSSL=false";
    private static final String user = "root";
    private static final String pass = "7777";

    private static Connection connection;

    public static Connection getConnection() throws SQLException{
            connection = DriverManager.getConnection(url, user,pass);
        return connection;
    }
}
