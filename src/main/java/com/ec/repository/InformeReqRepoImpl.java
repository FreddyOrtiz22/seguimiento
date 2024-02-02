package com.ec.repository;

import org.springframework.stereotype.Repository;

import com.ec.entity.InformeRequerimiento;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class InformeReqRepoImpl implements IInformeReqRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void crearInformeReq(InformeRequerimiento informe) {
		// TODO Auto-generated method stub
		this.entityManager.persist(informe);
	}

	@Override
	public InformeRequerimiento buscarInformeReq(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(InformeRequerimiento.class, id);
	}

	@Override
	public void borrarInformeReq(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.entityManager.find(InformeRequerimiento.class, id));
	}

	@Override
	public void actualizarInformeReq(InformeRequerimiento informe) {
		// TODO Auto-generated method stub
		this.entityManager.merge(informe);
	}

	
	
	
}
