package com.centrosanluis.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.centrosanluis.model.Rol;
import com.centrosanluis.service.RolService;

@WebServlet("/listadoRol")
public class ListadoRolController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     RolService rolService;  
   
	
	public void init(ServletConfig config) throws ServletException {
		rolService= new RolService(); //iniciar la instacia que hemos creado
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			List<Rol>listadoRoles= rolService.getRoles(); //con el service, y el metodo del Dao obtenemos los roles de la bbdd
		
			request.setAttribute("listadoRoles", listadoRoles); //para que el html tnga como obtener los roles
			request.getRequestDispatcher("private/listadoRoles.jsp").forward(request, response);
			
			
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse respoonse) throws ServletException, IOException {
		
	int id= Integer.parseInt(request.getParameter("id"));
	rolService.deleteRol(id);
		
	}
}
