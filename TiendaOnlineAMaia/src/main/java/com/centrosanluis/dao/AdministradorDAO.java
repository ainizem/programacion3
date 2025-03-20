package com.centrosanluis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.centrosanluis.model.Administrador;

public class AdministradorDAO {
	
	public List<Administrador> getUsers(){
		List<Administrador> administradores = new ArrayList<Administrador>();
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "SELECT usuario, nombre, email FROM administrador";
		
		try {
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				Administrador a = new Administrador();
				
				a.setNombre(rs.getString("nombre"));
				a.setEmail(rs.getString("email"));
				a.setUsuario(rs.getString("usuario"));
								
				administradores.add(a);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			AccesoBD.closeConnection(null, ps, con);
		}
		
		return administradores;
	}
	
	
	public Administrador login(Administrador administrador) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Administrador a = new Administrador();
		
		String sql = "SELECT usuario, nombre, apellidos,email, "
				+ "FROM uadministrador"
				+ "WHERE usuario = ? AND contrasena = ?";

		try {
			ps = con.prepareStatement(sql);
			
			ps.setString(1, administrador.getUsuario());
			ps.setString(2, administrador.getContrasena());
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				a.setNombre(rs.getString("nombre"));
				a.setApellidos(rs.getString("apellidos"));
				a.setEmail(rs.getString("email"));
				a.setUsuario(rs.getString("usuario"));					
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			AccesoBD.closeConnection(null, ps, con);
		}
		
		return a;
	}

}
