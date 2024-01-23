package com.ec.entity;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table (name = "repuesto")
public class Repuesto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ("sec_repu"))
	@SequenceGenerator(name = "sec_repu", sequenceName = "sec_repu", allocationSize = 1)
	@Column(name = "repu_id")
	private Integer id;
	
	
	@Column(name = "repu_tipo")
	private String tipo;
	
	@Column(name = "repu_precio")
	private BigDecimal precio;
	
	@Column(name = "repu_nombre")
	private String nombre;
	
	@Column(name = "repu_stock")
	private BigDecimal stock;
	
	@Column(name = "repu_cantidad")
	private BigDecimal cantidad;
	
	@ManyToOne
	@JoinColumn(name = "repu_equipo_id")
	private Equipo equipo;
	
	
	@OneToMany(mappedBy = "repuesto")
	private List<Proveedor> proveedor;
	
	
	//get and set

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getStock() {
		return stock;
	}

	public void setStock(BigDecimal stock) {
		this.stock = stock;
	}

	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	
	
	

}
