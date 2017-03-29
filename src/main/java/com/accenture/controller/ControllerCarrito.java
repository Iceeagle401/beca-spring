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
	
	CarritodeCompras carrito=new CarritodeCompras();
	List<String> lista=new ArrayList<>();
	@RequestMapping(value ="/carrito" )
	public String despliega(Model model)
{
		lista.clear();
	Stock muestra= new Stock();
	for(Producto p:muestra.getMiStock())
	{
		lista.add(p.getNombre());
	}
		
	model.addAttribute("lista",lista);
	model.addAttribute("carrito", carrito);
	
	
	
	return "view";
}
	
}	
