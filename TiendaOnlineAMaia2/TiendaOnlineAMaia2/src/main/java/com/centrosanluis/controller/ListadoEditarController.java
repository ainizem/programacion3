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


@WebServlet("/borrarProducto")
public class ListadoEditarController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ProductoService productoService;

	public ListadoEditarController() {
		super();
	}

	@Override
	public void init() throws ServletException {
		productoService = new ProductoService();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Producto> listadoProductos=productoService.getProductos();
		//cargar lista de productos
		
		//añadir a los atributos esa lista
		req.getSession().setAttribute("productos", listadoProductos);
		//redireccionar al jsp que corresponda
		resp.sendRedirect("private/eliminarYeditar.jsp");
	}
		
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.valueOf(request.getParameter("id"));
		
		Producto p = new Producto();
		
		p.setId(id);
		
		if(productoService.borrarProducto(p)) {
			response.sendRedirect("listadoProductos");
		}else {
			List<Producto> listadoProductos = productoService.getProductos();
			
			request.setAttribute("listadoProductos", listadoProductos);
			request.setAttribute("error", "El producto no se ha podido eliminar");
			
			request.getRequestDispatcher("private/eliminarYeditar.jsp").forward(request, response);
		}
	}
}