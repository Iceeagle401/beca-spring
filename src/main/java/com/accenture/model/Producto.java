package com.accenture.model;

public  class Producto {
	
	
	private String nombre;
	private float precio;
	private int stock;
	private int comprados;
 
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Producto() {
		
	}
	public Producto(float precio, int stock, String nombre) {
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
	public int getComprados() {
		return comprados;
	}
	public void setComprados(int comprados) {
		this.comprados = comprados;
	}
}
