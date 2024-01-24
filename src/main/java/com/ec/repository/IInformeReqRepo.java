package com.ec.repository;

import com.ec.entity.InformeRequerimiento;


public interface IInformeReqRepo {

	void crearInformeReq(InformeRequerimiento informe);
	InformeRequerimiento buscarInformeReq(Integer id);
	void borrarInformeReq(Integer id);
	void actualizarInformeReq(InformeRequerimiento informe);

	
}
