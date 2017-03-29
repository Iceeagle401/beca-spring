package com.accenture.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;

@Scope("session")
public class Stock {
	
	
	private static List<Producto> miStock;
	
	public Stock()
	{
		miStock= new ArrayList<>();
		Producto lavadora=new Producto(5,5, "lava");
		Producto compu=new Producto(5,5, "asus");
		Producto radio=new Producto(5,5, "radio");
		Producto tl084=new Producto(5,5, "tl084");
		
		miStock.add(lavadora);
		miStock.add(compu);
		miStock.add(radio);
		miStock.add(tl084);
	}

	public  List<Producto> getMiStock() {
		return miStock;
	}

	public static  void setMiStock(List<Producto> miStock) {
		Stock.miStock = miStock;
	}
	
	
}
