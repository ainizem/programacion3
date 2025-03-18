package com.centrosanluis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.centrosanluis.model.Producto;


public class ProductoDAO {
	
	public List<Producto> getUsers(){
		List<Producto> productos = new ArrayList<Producto>();
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "SELECT nombre, descripcion, precio FROM producto";
		
		try {
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				Producto p = new Producto();
				
				p.setNombre(rs.getString("nombre"));
				p.setDescripcion(rs.getString("email"));
				p.setPrecio(Double.parseDouble(rs.getString("usuario")));
				
				productos.add(p);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			AccesoBD.closeConnection(null, ps, con);
		}
		
		return productos;
	}

	public Producto getProductoByNombre(String nombre) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Producto p = new Producto();
		
		String sql = "SELECT id, nombre, descripcion"+ "FROM productos "
				+ "WHERE id = ?";

		try {
			ps = con.prepareStatement(sql);
			
			ps.setString(1, nombre);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				p.setNombre(rs.getString("nombre"));
				p.setDescripcion(rs.getString("email"));
				p.setPrecio(Double.parseDouble(rs.getString("usuario")));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			AccesoBD.closeConnection(null, ps, con);
		}
		
		return p;
	}

	
	public Producto getProductoByStock(String stock) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Producto p = new Producto();
		
		String sql = "SELECT id, nombre, descripcion "+ "FROM productos "
				+ "WHERE id = ?";

		try {
			ps = con.prepareStatement(sql);
			
			ps.setString(1, stock);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				p.setNombre(rs.getString("nombre"));
				p.setDescripcion(rs.getString("email"));
				p.setPrecio(Double.parseDouble(rs.getString("usuario")));
				p.setImagen(rs.getString("imagen"));
				p.setDescripcionMas(rs.getString("descripcionMas"));
				p.setStock(Integer.parseInt(rs.getString("stock")));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			AccesoBD.closeConnection(null, ps, con);
		}
		
		return p;
	}
	
	
	
}
