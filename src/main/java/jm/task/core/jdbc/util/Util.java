package jm.task.core.jdbc.util;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Util {
    private static final String connectionUrl = "jdbc:mysql://localhost:3306/test";
    private static final String username = "root";
    private static final String password = "1234";
    public Util() {

    }
    public static Connection getMysqlConnection() throws SQLException, ClassNotFoundException {
        return DriverManager.getConnection(connectionUrl, username, password);
    }
}
