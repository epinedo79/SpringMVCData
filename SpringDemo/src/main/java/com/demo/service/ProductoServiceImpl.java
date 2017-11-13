package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Producto;
import com.demo.repository.ProductoRepository;

@Service("productoService")
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	ProductoRepository productoRepository;

	@Override
	public List<Producto> cargarObtenerProductos(String fileName) {
		System.out.println("cargarObtenerProductos inicio...");
		productoRepository.cargarProductos(fileName);
		System.out.println("carga ok.");
		List<Producto> listaResult = productoRepository.obtenerProductos();
		System.out.println("cargarObtenerProductos fin...");
		return listaResult;
	}
}
