package com.rubensaraujo.locadora.connectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	//return DriverManager.getConnection("jdbc:mysql://localhost:3306/locadora", "root", "root");
        	return DriverManager.getConnection("jdbc:mysql://localhost:3306/locadora?useTimezone=true&serverTimezone=UTC", "root", "imd@2017"); //mysql IMD
        			
        } 
        catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
