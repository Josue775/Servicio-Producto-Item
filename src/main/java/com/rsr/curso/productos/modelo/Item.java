package com.rsr.curso.productos.modelo;

public class Item {
//producto 
//cuantos hay 
	
	private Producto producto;
	private Integer cantidad;
	
	public Item (Producto producto,Integer cantidad) {
		this.producto=producto;
		this.cantidad=cantidad;
		
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Double getTotal() {
		return producto.getPrecio()*cantidad.doubleValue();
	}
}
