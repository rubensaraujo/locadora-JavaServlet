package com.rubensaraujo.locadora.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rubensaraujo.locadora.dao.UsuarioDAO;
import com.rubensaraujo.locadora.model.UsuarioModel;

/**
 * Servlet implementation class Cadastro
 */
@WebServlet("/cadastro")
public class Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String email = request.getParameter("email");
		
		
		UsuarioModel user = new UsuarioModel();
		
		user.setNome(nome);
		user.setLogin(login);
		user.setSenha(senha);
		user.setEmail(email);
		
		UsuarioDAO userDao = new UsuarioDAO();
		
		userDao.adicionaUsuario(user);
		
		PrintWriter pw =  response.getWriter();
		
		pw.println("<html>");
		pw.println("<body>");
		pw.println("Usuario cadastrado com sucesso!");
		pw.println("</body>");
		pw.println("</html>");
	}

}
