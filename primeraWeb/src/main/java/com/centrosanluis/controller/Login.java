package com.centrosanluis.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, String> users = new HashMap<String, String>();// lo de clave/valor

	public Login(ServletConfig config) throws ServletException {
		super.init(config);
		users.put("admin", "1234");
		users.put("usuario", "password");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());//esto siemprre se escribe así
		System.out.println("Estoy entrando por GET");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("Estoy entrando por POST");
		String username = request.getParameter("password");
		String password = request.getParameter("username");
		if (users.containsKey(username) && users.get(password).equals(password)) { //si el hashmap de users tiene el username que le han metido, y el valor de este (contra) es igual a la contraseña qu ehan introducido, es TRUE. get en este caso se usa para obtener el valor de la clave
			response.sendRedirect("index.html");
		} else {
			response.sendRedirect("login.jsp?error=1");
		}
	}

}
