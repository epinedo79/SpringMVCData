package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.demo.entity.Producto;
import com.demo.service.ProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	ProductoService productoService;
	
	@RequestMapping(method = RequestMethod.GET)
    public String test(ModelMap model) {
		try {
			String fileName = "Productos.csv";
			List<Producto> listaProductos = productoService.cargarObtenerProductos(fileName);
			System.out.println("total lista cargada =" + listaProductos.size());
		}catch(Exception ex) {
			ex.printStackTrace();
		}
        model.addAttribute("greeting", "Test OK");
        return "welcome";
    }
	
	
	@RequestMapping(value="/load", method = RequestMethod.POST)
    public String loadProductos(ModelMap model) {
		System.out.println("ProductoController inicio.............loadProductos");
		List<Producto> listaProductos = null;
		try {
			String fileName = "Productos.csv";
			listaProductos = productoService.cargarObtenerProductos(fileName);
			System.out.println("total lista cargada =" + listaProductos.size());
		}catch(Exception ex) {
			ex.printStackTrace();
		}
        model.addAttribute("listaProductos", listaProductos);
        return "welcome";
    }

}
