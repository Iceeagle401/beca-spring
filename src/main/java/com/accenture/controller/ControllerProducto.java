package com.accenture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerProducto {
	
	@RequestMapping(value ="/subirProducto")
	public String despliega(Model model)
	{
		return "addProduct";
	}
	
}
