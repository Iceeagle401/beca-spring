package com.accenture.model;

public  class Producto {
	
	
	private String nombre;
	private float precio;
	private float stock;
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getStock() {
		return stock;
	}
	public void setStock(float stock) {
		this.stock = stock;
	}
	public Producto() {
		
	}
	public Producto(float precio, float stock, String nombre) {
		this.precio = precio;
		this.stock = stock;
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
