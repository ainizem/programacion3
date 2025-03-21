package com.centrosanluis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.centrosanluis.model.Producto;


public class ProductoDAO {
	
	public List<Producto> getProductos(){
		ArrayList<Producto> productos = new ArrayList<Producto>();
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "SELECT id, nombre, descripcion, precio, imagen FROM producto";
		
		try {
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while (rs.next()) {
				Producto p = new Producto();
				
				p.setId(rs.getInt("id"));
				p.setNombre(rs.getString("nombre"));
				p.setDescripcion(rs.getString("descripcion"));
				p.setPrecio(rs.getDouble("precio"));
				p.setImagen(rs.getString("imagen"));
				
				productos.add(p);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			AccesoBD.closeConnection(null, ps, con);
		}
		
		return productos;
	}

	public boolean borrarProducto(Producto producto) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		
		String sql = "DELETE FROM tiendaonlineBD WHERE id = ?";
		
		try {
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, producto.getId());
			
			if(ps.executeUpdate() > 0) {
				return true;
			}else {
				return false;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			AccesoBD.closeConnection(null, ps, con);
		}
		return false;
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
				p.setDescripcion(rs.getString("descripcion"));
				p.setPrecio(Double.parseDouble(rs.getString("precio")));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			AccesoBD.closeConnection(null, ps, con);
		}
		
		return p;
	}

	
	public Producto getProductoByStock() {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Producto p = new Producto();
		
		String sql = "SELECT id, nombre, descripcion "+ "FROM productos "
				+ "WHERE stock >=1";

		try {
			ps = con.prepareStatement(sql);
			
		
			
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
	
	
	public Producto getProductoByCategoria() {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Producto p = new Producto();
		
		String sql = "SELECT id, nombre, descripcion"+ "FROM productos "
				+ "WHERE stock >=1";

		try {
			ps = con.prepareStatement(sql);
			
		
			
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

	public boolean addProducto(Producto nuevoProducto) {
		Connection con = AccesoBD.getConnection();
		PreparedStatement ps = null;
		
		String sql = "INSERT INTO productos (nombre, descripcion, precio, stock, imagen) VALUES (?,?,?,?,?)";
		
		try {
			ps = con.prepareStatement(sql);
			
			ps.setString(1, nuevoProducto.getNombre());
			ps.setString(2, nuevoProducto.getDescripcion());
			ps.setDouble(3, nuevoProducto.getPrecio());
			ps.setInt(4, nuevoProducto.getStock());
			ps.setString(5, nuevoProducto.getImagen());
		
			if(ps.executeUpdate() > 0) {
				return true;
			}else {
				return false;
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			AccesoBD.closeConnection(null, ps, con);
		}
		return false;
	}	
	
	
		
}
