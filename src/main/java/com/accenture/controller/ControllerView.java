package com.accenture.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
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
	//@Autowired
	public Stock muestra=new Stock();
	public int  opcion=0, cantidad;
	private static List<Producto> listaNueva =new ArrayList<>();
	@RequestMapping(value = "/addProduct")
	public String updateList(SessionStatus status, @ModelAttribute("producto") Producto producto, Model model){
		
		//muestra=new Stock();
		model.addAttribute("sesPro", muestra);
		listaNueva=muestra.getMiStock();
		listaNueva.add(producto);
		Stock.setMiStock(listaNueva);
		
		cantidad=listaNueva.size();
		for(int i=0; i<cantidad;i++)
		System.out.println(listaNueva.get(i).getNombre());
		return "addProduct";
		
		
		
	}
	@RequestMapping(value ="/showProducts", method = RequestMethod.GET )
		public String mostrarProductos(Model model)
	{
		//Stock muestra= new Stock();
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
