package com.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entity.Producto;

@Repository
public class ProductoRepositoryImpl implements ProductoRepository {

	private EntityManager em;

	@Autowired
	public ProductoRepositoryImpl(JpaContext context) {
		this.em = context.getEntityManagerByManagedType(Producto.class);
	}

	@Override
	@Transactional
	public void cargarProductos(String fileName) {
        Query query = em.createNativeQuery("{call Test.cargarArchivo(?)}");
        query.setParameter(1, fileName);
        query.executeUpdate();        		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Producto> obtenerProductos() {
		 Query query = em.createNamedQuery("Producto.findAllProductos");
	     return query.getResultList();
	}

}
