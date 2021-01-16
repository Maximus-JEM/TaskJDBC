package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.*;

public class Main {
    public static void main(String[] args)  {
        UserServiceImpl impl = new UserServiceImpl();
        impl.createUsersTable();
        impl.saveUser("Petryha", "One", (byte) 9);
        impl.saveUser("Zaur", "Triglov", (byte) 80);
        impl.saveUser("Maksim", "Pavlov", (byte) 23);
        impl.saveUser("Dasha", "Kostomarova", (byte) 19);
        impl.getAllUsers();
//        impl.cleanUsersTable();
//        impl.dropUsersTable();
            }
        }


