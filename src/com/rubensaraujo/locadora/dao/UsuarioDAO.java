package com.rubensaraujo.locadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.rubensaraujo.locadora.connectionDB.ConnectionFactory;
import com.rubensaraujo.locadora.model.UsuarioModel;

public class UsuarioDAO {

	private Connection connection;

	public UsuarioDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void adcionaUsuario(UsuarioModel user) {
		
		String sql = "insert into usuario " + "(nome,login,senha,email) " + "values(?,?,?,?)";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, user.getNome());
			stmt.setString(2, user.getLogin());
			stmt.setString(3, user.getSenha());
			stmt.setString(4, user.getEmail());
			
			stmt.execute();
			stmt.close();
		} 
		catch (SQLException ex) {
			throw new RuntimeException(ex);
		}
	}
}
