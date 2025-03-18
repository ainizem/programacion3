package com.centrosanluis.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.centrosanluis.model.Producto;
import com.centrosanluis.service.ProductoService;


/**
 * Servlet implementation class ListadoController
 */
@WebServlet("/ListadoController")
public class ListadoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ProductoService productoService;

	public ListadoController() {
		super();
	}
	
	public void init() throws ServletException {
		productoService = new ProductoService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<Producto> productos=productoService.getProductos();
		
		request.setAttribute("productos", productos);
		
		request.getRequestDispatcher("index.jsp").forward(request, response);

	}

}
