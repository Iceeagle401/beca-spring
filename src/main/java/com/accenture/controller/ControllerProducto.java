package com.accenture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accenture.model.ListadeProductos;

@Controller
public class ControllerProducto {
	
	@RequestMapping(value ="/selecProducto")
	public String despliega(@ModelAttribute("producto") ListadeProductos myStock)
	{
		//myStock.getProductoElegido(.get(0);
		return "view";
	}
	
}
