package com.chai.core;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Бакыт Турсунбеков on 3-Mar 17.
 */
public class DatabaseLoader {
    private final String URL="jdbc:mysql://localhost:3306/chai";
    private final String USERNAME="root";
    private final String PASSWORD="";
    public void connect(){
        Connection connection;
        FabricMySQLDriver driver;
        try {
            driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            connection.close();
        } catch (SQLException e) {
            System.err.println("Берилиштер базасы менен байланышууда ката чыкты!");
        }
    }
}
