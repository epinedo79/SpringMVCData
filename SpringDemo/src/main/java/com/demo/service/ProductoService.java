package com.demo.service;


import java.util.List;

import com.demo.entity.Producto;

public interface ProductoService {

	List<Producto> cargarObtenerProductos(String fileName);

}
