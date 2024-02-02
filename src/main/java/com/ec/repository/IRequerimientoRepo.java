package com.ec.repository;


import com.ec.entity.Requerimiento;

public interface IRequerimientoRepo {

	void crearRequerimiento(Requerimiento requerimiento);
	Requerimiento buscarRequerimiento(Integer id);
	void borrarRequerimiento(Integer id);
	void actualizarRequerimiento(Requerimiento requerimiento);
	
}
