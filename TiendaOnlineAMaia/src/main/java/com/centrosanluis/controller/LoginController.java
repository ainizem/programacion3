package com.centrosanluis.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.centrosanluis.model.Administrador;
import com.centrosanluis.service.AdminstradorService;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	AdminstradorService administradorService;

	public LoginController() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		administradorService = new AdminstradorService();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Administrador administrador = new Administrador();
		administrador.setUsuario(request.getParameter("usuario"));
		administrador.setContrasena(request.getParameter("contrasena"));

		Administrador adminstradorLogin = administradorService.login(administrador);

		if (adminstradorLogin != null) {

			if (request.getParameter("recuerdame") != null) {
				Cookie cookie = new Cookie("administrador", adminstradorLogin.getUsuario());

				cookie.setMaxAge(60 * 60 * 24 * 100);

				response.addCookie(cookie);
			}
			request.getSession().setAttribute("administrador", adminstradorLogin);
			response.sendRedirect("private/index.jsp");
		} else {
			response.sendRedirect("login.jsp?error=1");
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
