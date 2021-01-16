package jm.task.core.jdbc.util;


import java.sql.*;

public class Util {

   private static final String url = "jdbc:mysql://localhost:3306/first_lesson?serverTimezone=Europe/Minsk&useSSL=false";
   private static final String userName = "root";
   private static final String pass = "Augustrush12!";

    public Util() {
    }

    public Connection getConnection() {
        Connection connection = null;

        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(url, userName, pass);
        } catch (SQLException var3) {
            var3.printStackTrace();
        }
        return connection;
    }

}
