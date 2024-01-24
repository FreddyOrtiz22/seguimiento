package com.ec.repository;

import com.ec.entity.DetalleRequerimiento;

public interface IDetalleRequerimientoRepo {
	
	void crearDetalleRequerimiento(DetalleRequerimiento deta);
	DetalleRequerimiento buscarDetalle(Integer id);
	void actualizarDetalleRequerimiento(DetalleRequerimiento deta);
	void borrarDetalleRequerimiento(Integer id);
	
}
