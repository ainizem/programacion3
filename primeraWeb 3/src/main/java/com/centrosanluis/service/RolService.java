package com.centrosanluis.service;

import java.util.ArrayList;

import com.centrosanluis.dao.RolDAO;
import com.centrosanluis.model.Rol;
import com.centrosanluis.model.Usuario;


public class RolService {
	
	RolDAO rolBD;

	public RolService() {
		rolBD = new RolDAO();
	}
	
	public ArrayList<Rol> getRoles() {

		ArrayList<Rol> listadoRoles = rolBD.getRoles();		
		System.out.println("service: "+listadoRoles);
		return rolBD.getRoles();
	}

	
}
