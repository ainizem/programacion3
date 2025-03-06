package com.centrosanluis.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.centrosanluis.model.Rol;
import com.centrosanluis.model.Usuario;
import com.centrosanluis.service.RolService;
import com.centrosanluis.service.UsuarioService;

@WebServlet("/registro")
public class AltaUsuarioController extends HttpServlet{
	
	UsuarioService usuarioService;
    	RolService rolService;

    @Override
    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	usuarioService = new UsuarioService();
    	rolService = new RolService(); 
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	
    	ArrayList<Rol> listadoRoles = rolService.getRoles();
    	request.getSession().setAttribute("roles", listadoRoles);
    	System.out.println("controller: "+listadoRoles);
		response.sendRedirect("registro.jsp");
    	    	
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String nombre = req.getParameter("nombre");
    	String apellidos = req.getParameter("apellidos");
    	String telefono = req.getParameter("telefono");
    	String email = req.getParameter("email");
    	String usuario = req.getParameter("usuario");
    	String contrasena = req.getParameter("contrasena");
    	int rol = Integer.parseInt(req.getParameter("rol"));
    	Usuario nuevoUsuario = new Usuario(nombre, apellidos, email, telefono, usuario, contrasena, rol);
    	
    	if(usuarioService.addUser(nuevoUsuario)) {
    		resp.sendRedirect("login.jsp");
    	}else {
    		req.setAttribute("error", "No se ha podido dar de alta el usuario");
    		req.getRequestDispatcher("registro.jsp").forward(req, resp);
    	}
    }
}
