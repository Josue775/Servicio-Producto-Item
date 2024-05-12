package com.rsr.curso.productos.modelo;

import java.sql.Date;

public class Producto {
///atributos de la tabla
	/*
	 	"id": 2,
		"nombre": "Sony",
		"precio": 700,
		"createAt": "2024-05-11"
	 */
	private Long id;
	private String nombre;
	private Double precio;
	private Date createAt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	
	
}
