package com.centrosanluis.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.centrosanluis.model.Administrador;
import com.centrosanluis.model.Producto;
import com.centrosanluis.service.ProductoService;


@WebServlet("/ListadoEditarController")
public class ListadoEditarController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ProductoService productoService;

	public ListadoEditarController() {
		super();
	}

	public void init() throws ServletException {
		productoService = new ProductoService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Producto> listadoProductos = productoService.getProductos();

		request.setAttribute("listadoProductos", listadoProductos);

		request.getRequestDispatcher("private/eliminarYeditar.jsp").forward(request, response);
	}

}