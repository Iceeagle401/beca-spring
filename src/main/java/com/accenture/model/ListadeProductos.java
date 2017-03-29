package com.accenture.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListadeProductos {
	
	//private List<Producto>miStock;
	
	
	String[] productoElegido;
	List<String> miStock;
	
	public List<String> getMiStock() {
		return miStock;
	}




	public void setMiStock(List<String> miStock) {
		this.miStock = miStock;
	}




	public ListadeProductos() {
		List<String> miStock=new ArrayList<>();
		miStock.add("computadora");
		miStock.add("lavadora");
		miStock.add("televisor");
		
		
		
	}


	

	public String[] getProductoElegido() {
		return productoElegido;
	}




	public void setProductoElegido(String[] productoElegido) {
		this.productoElegido = productoElegido;
	}




	
	
	

}
