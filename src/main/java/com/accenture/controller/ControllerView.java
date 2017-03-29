package com.accenture.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.model.Producto;
import com.accenture.model.Stock;

@Controller
public class ControllerView {
	
	
//public List<String> list=new ArrayList<>();
	
	
	@RequestMapping(value ="/showProducts", method = RequestMethod.GET)
	
	public ModelAndView mostrarProductos(@ModelAttribute ("productos") Stock muestra)
	{
		
		List<Producto> pro=muestra.getMiStock();
		for(Producto p: pro)
		{
			System.out.println(p.getNombre());
		}
		
		
		
		return new ModelAndView("showProduct" , "productos", muestra);
	}

}
