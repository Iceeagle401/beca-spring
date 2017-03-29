package com.accenture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.accenture.model.Producto;
import com.accenture.model.Stock;

@Controller
@SessionAttributes("opcion")
public class ControllerMostrarSol {
	
	public String x="lava";
	public Producto mostrado;
	@RequestMapping(value ="/showObj")
	public String muestrame(Model model)
	{
		Stock miStock=new Stock();
		for(Producto p: miStock.getMiStock())
		{
			if(p.getNombre().equals(x))
			{
				mostrado=p;
			}
		}
		System.out.println(mostrado.getNombre());
		model.addAttribute("producto",mostrado);
		
		
		return "showpro";
	}

}
