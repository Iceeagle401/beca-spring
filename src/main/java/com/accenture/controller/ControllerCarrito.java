package com.accenture.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.accenture.model.CarritodeCompras;
import com.accenture.model.Customer;
import com.accenture.model.Producto;
import com.accenture.model.Stock;

@Controller
public class ControllerCarrito {
	
	private Customer muestra= new Customer();
	
	
	@RequestMapping(value ="/carrito" )
	public String despliega(Model model)
{
		List<String> lista=new ArrayList<>();
		CarritodeCompras carrito=new CarritodeCompras();
		muestra= new Customer();
		lista.clear();
	
	for(Producto p:muestra.getMiStock())
	{
		lista.add(p.getNombre());
	}
		
	model.addAttribute("lista",lista);
	model.addAttribute("carrito", carrito);
//	if(carrito.getProductoElegido().isEmpty())
//	System.out.println("no llenaste nada");
//	else{
//		for(String p: carrito.getProductoElegido())
//	
//	{
//		System.out.println(p);
//	}
//		
//	}
	return "view";
}
	
}	
