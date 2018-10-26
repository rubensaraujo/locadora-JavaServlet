package com.rubensaraujo.locadora.connectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
        try {
        	Class.forName("com.mysql.jdbc.Driver");
        	return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/locadora", "root", "root");
        } 
        catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
