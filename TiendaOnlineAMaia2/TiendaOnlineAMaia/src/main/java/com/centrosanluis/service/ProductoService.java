package com.centrosanluis.service;

import java.util.List;

import com.centrosanluis.dao.ProductoDAO;
import com.centrosanluis.model.Producto;

public class ProductoService {
	
	ProductoDAO productoBD = new ProductoDAO();
	
	
	public List<Producto> getProductos() {
		return productoBD.getProductos();
	}
	
	public boolean borrarProducto(Producto producto) {
		return productoBD.borrarProducto(producto);
	}
}
