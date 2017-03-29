package com.accenture.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.model.Producto;
import com.accenture.model.Stock;

@Controller
@SessionAttributes({"sesPro" ,"opcion"})

public class ControllerView {
	
	
//public List<String> list=new ArrayList<>();
	public Stock muestra;
	public int  opcion=0;
	@RequestMapping(value ="/showProducts", method = RequestMethod.GET )
		public String mostrarProductos(Model model)
	{
		Stock muestra= new Stock();
		model.addAttribute("sesPro",muestra);
		
		List<Producto> pro=muestra.getMiStock();
		for(Producto p: pro)
		{
			System.out.println("Aqui hay" +p.getNombre());
		}
		
		return "showProduct";
	}
	@RequestMapping(value ="/showProducts", method = RequestMethod.POST)
	public String mostrarProductosn(Model model)
{
	//Stock muestra= new Stock();
	model.addAttribute("sesPro",muestra);
	
	List<Producto> pro=muestra.getMiStock();
	for(Producto p: pro)
	{
		System.out.println("Aqui hay" +p.getNombre());
	}
	
		System.out.println(opcion);
	return "showProduct";
}


}
