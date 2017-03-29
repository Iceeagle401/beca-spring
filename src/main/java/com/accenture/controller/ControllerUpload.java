package com.accenture.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.accenture.model.Producto;
import com.accenture.model.Stock;

@Controller
public class ControllerUpload {
	
	private Stock listaVieja=new Stock();
	private List<Producto> listaNueva =new ArrayList<>();
	int cantidad;
	
	@RequestMapping(value = "/addProduct")
	public String updateList(@ModelAttribute("producto") Producto producto){
			
		listaNueva=listaVieja.getMiStock();
		listaNueva.add(producto);
		listaVieja.setMiStock(listaNueva);
		cantidad=listaNueva.size();
		for(int i=0; i<cantidad;i++)
		System.out.println(listaNueva.get(i).getNombre());
		return "addProduct";
		
		
		
	}

}
