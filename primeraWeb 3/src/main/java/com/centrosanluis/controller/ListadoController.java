package com.centrosanluis.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.centrosanluis.model.Usuario;
import com.centrosanluis.service.UsuarioService;

/**
 * Servlet implementation class ListadoController
 */
@WebServlet("/listadoUsuarios")
public class ListadoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UsuarioService usuarioService;

    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	usuarioService = new UsuarioService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// llamo al service para obtener todos los usuarios

		//UsuarioService usuarioService = new UsuarioService();
		ArrayList<Usuario> listadoUsuarios = usuarioService.getUsuarios();

		if (listadoUsuarios == null) {
			listadoUsuarios = new ArrayList<Usuario>(); // Inicializa una lista vacía si es nula
		}

		request.setAttribute("listadoUsuarios", listadoUsuarios);
		request.getRequestDispatcher("/private/listado.jsp").forward(request, response); //es un foward, está la peticion encadenada

		
		// añado en la request el atributo (no sesion) listado usuarios

		// encadeno la peticion y la envio a listado.jsp
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
