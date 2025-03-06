package com.centrosanluis.model;

public class Rol {
	
	int id;
	String rol, descripcion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Rol [id=" + id + ", rol=" + rol + ", descripcion=" + descripcion + "]";
	}
	

}
