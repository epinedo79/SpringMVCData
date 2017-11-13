package com.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PRODUCTOS")
@NamedQueries({
    @NamedQuery(name = "Producto.findAllProductos", query = "SELECT p FROM Producto p")
    })
public class Producto implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
    @SequenceGenerator(sequenceName = "SEQ_ID_PRODUCTO", initialValue = 1, allocationSize = 1, name = "CUST_SEQ")
    @Column(name = "ID_PRODUCTO")
    private Long id;
    
    @Column(name = "ID_PAIS")    
    private String codPais;
    
    @Column(name = "CODIGO")    
    private String codigo;
    
    @Column(name = "DESCRIPCION")    
    private String descripcion;
    
    @Column(name = "TIPO_UNIDAD")    
    private String tipoUnidad;
    
    @Column(name = "CAPACIDAD")    
    private BigDecimal capacidad;
    
    @Column(name = "ESTADO")    
    private String estado;
    
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodPais() {
		return codPais;
	}

	public void setCodPais(String codPais) {
		this.codPais = codPais;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipoUnidad() {
		return tipoUnidad;
	}

	public void setTipoUnidad(String tipoUnidad) {
		this.tipoUnidad = tipoUnidad;
	}

	public BigDecimal getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(BigDecimal capacidad) {
		this.capacidad = capacidad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
        

}
