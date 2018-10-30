package com.rubensaraujo.locadora.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rubensaraujo.locadora.dao.UsuarioDAO;

@WebServlet(urlPatterns="/login")
public class Login extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}*/
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = resp.getWriter();

	    String login = req.getParameter("login");
	    String senha = req.getParameter("senha");

	    UsuarioDAO userDao = new UsuarioDAO();

	    if (userDao.buscaUsuarioLoginSenha(login, senha) == false) {
	        writer.println("<html><body>Usuário ou senha inválida</body></html>");
	    } else {
	        HttpSession session = req.getSession();
	        session.setAttribute("usuarioLogado", login);
	        writer.println("<html><body>Usuário logado: " + login
	                + "</body></html>");
	    }
	}

}
