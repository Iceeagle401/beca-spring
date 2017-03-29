package com.accenture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accenture.model.CarritodeCompras;

@Controller
public class ControllerCarrito {
	
	CarritodeCompras myStock=new CarritodeCompras();
	
	
	
	@RequestMapping(value ="/carrito")
	public String despliega(@ModelAttribute("producto") CarritodeCompras myStock)
	{
		//myStock.getProductoElegido(.get(0);
		return "view";
	}
	
}
