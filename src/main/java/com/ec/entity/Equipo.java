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
@Table(name = "equipo")
public class Equipo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ("sec_equi"))
	@SequenceGenerator(name = "sec_equi", sequenceName = "sec_equi", allocationSize = 1)
	@Column(name = "equi_id")
	private Integer id;
	
	
	@Column(name = "equi_tipo")
	private String tipo;
	
	@Column(name = "equi_marca")
	private String marca;
	
	@Column(name = "equi_modelo")
	private String modelo;
	
	@Column(name = "equi_serie")
	private String serie;
	
	@Column(name = "equi_precio_reparacion")
	private BigDecimal precioReparacion;

	
	@OneToMany(mappedBy = "equipo")
	private List<DetalleRequerimiento> detallesReq;
	
	
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public BigDecimal getPrecioReparacion() {
		return precioReparacion;
	}

	public void setPrecioReparacion(BigDecimal precioReparacion) {
		this.precioReparacion = precioReparacion;
	}
	
	
	
	
	
	
	
	
	
}
