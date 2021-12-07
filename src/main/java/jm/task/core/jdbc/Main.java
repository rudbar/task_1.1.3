package jm.task.core.jdbc;

import com.mysql.cj.jdbc.Driver;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        UserServiceImpl us = new UserServiceImpl();
        us.createUsersTable();
       /* us.saveUser("Ivan", "Ivanov", (byte) 20);
        us.saveUser("Anna", "Churova", (byte) 19);
        us.saveUser("Alex", "Petrov", (byte) 22);
        us.saveUser("Ksenia", "Pirogova", (byte) 25);
        us.getAllUsers();
        us.cleanUsersTable();
        us.dropUsersTable();*/
    }
}
