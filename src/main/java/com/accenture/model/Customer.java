package com.accenture.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	List<Producto> misCompras;
	public Customer()
	{
		misCompras=new ArrayList(); 
		Producto lav= new Producto(5, 5, "lav");
	}

}
