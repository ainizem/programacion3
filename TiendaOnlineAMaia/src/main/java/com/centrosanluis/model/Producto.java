package com.centrosanluis.model;

public class Producto {
	
	int id, stock, id_categoria;
	String nombre, descripcion, imagen, descripcionMas;
	Double precio;
	
	
	public Producto() {
		super();
	}
	public Producto(int id, int stock, int id_categoria, String nombre, String descripcion, String imagen,
			String descripcionMas, Double precio) {
		super();
		this.id = id;
		this.stock = stock;
		this.id_categoria = id_categoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.descripcionMas = descripcionMas;
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getDescripcionMas() {
		return descripcionMas;
	}
	public void setDescripcionMas(String descripcionMas) {
		this.descripcionMas = descripcionMas;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", stock=" + stock + ", id_categoria=" + id_categoria + ", nombre=" + nombre
				+ ", descripcion=" + descripcion + ", imagen=" + imagen + ", descripcionMas=" + descripcionMas
				+ ", precio=" + precio + "]";
	}
	
	
	
	

}
