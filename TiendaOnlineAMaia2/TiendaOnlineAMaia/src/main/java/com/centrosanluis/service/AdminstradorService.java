package com.centrosanluis.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.centrosanluis.dao.AdministradorDAO;
import com.centrosanluis.model.Administrador;

public class AdminstradorService {
	
	AdministradorDAO administradorBD; 
	
	public Administrador login(Administrador administrador) {
		administrador.setContrasena("contrasena");
		
		return administradorBD.login(administrador);
	}
	
	
	

}
