package com.rubensaraujo.locadora.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/home")
public class ServletTest extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
	
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h1>");
		pw.println("Teste");
		pw.println("</h1>");
		pw.println("<body>");
		pw.println("</html>");
	}
}
