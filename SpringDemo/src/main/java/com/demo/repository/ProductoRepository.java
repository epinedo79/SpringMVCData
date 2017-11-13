package com.demo.repository;



import java.util.List;

import org.springframework.data.repository.Repository;

import com.demo.entity.Producto;

public interface ProductoRepository extends Repository<Producto, Long>{

	void cargarProductos(String fileName);

	List<Producto> obtenerProductos();

}
