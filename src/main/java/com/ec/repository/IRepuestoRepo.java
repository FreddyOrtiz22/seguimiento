package com.ec.repository;

import com.ec.entity.Repuesto;

public interface IRepuestoRepo {

	void crearRepuesto(Repuesto repuesto);
	Repuesto buscarRepuesto(Integer id);
	void borrarRepuesto(Integer id);
	void actualizarRepuesto(Repuesto repuesto);
	
}
