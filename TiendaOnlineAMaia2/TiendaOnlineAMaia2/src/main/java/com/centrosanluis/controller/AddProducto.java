package com.centrosanluis.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.centrosanluis.model.Producto;
import com.centrosanluis.service.ProductoService;



@WebServlet("/AddProducto")
public class AddProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    ProductoService productoService;
    
    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	productoService = new ProductoService();
    }
    
    
    public AddProducto() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String descripcion = request.getParameter("descripcion");
		Integer stock= (Integer.valueOf(request.getParameter("stock")));
		Double precio= (Double.parseDouble(request.getParameter("precio"))); 
		
	
	Producto nuevoProducto= new Producto(nombre, descripcion, stock, precio);
	
	
	
	if(productoService.addProducto(nuevoProducto)) {
		response.sendRedirect("index.jsp");
	}else {
		request.setAttribute("error", "No se ha podido añadir el producto");				
		request.getRequestDispatcher("eliminarYeditar.jsp").forward(request, response);
	}
	}
	
	

}
