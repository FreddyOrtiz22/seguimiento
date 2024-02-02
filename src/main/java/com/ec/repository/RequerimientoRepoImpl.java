package com.ec.repository;

import org.springframework.stereotype.Repository;

import com.ec.entity.Requerimiento;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class RequerimientoRepoImpl implements IRequerimientoRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void crearRequerimiento(Requerimiento requerimiento) {
		// TODO Auto-generated method stub
		this.entityManager.persist(requerimiento);
	}

	@Override
	public Requerimiento buscarRequerimiento(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Requerimiento.class, id);
	}

	@Override
	public void borrarRequerimiento(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.entityManager.find(Requerimiento.class, id));
	}

	@Override
	public void actualizarRequerimiento(Requerimiento requerimiento) {
		// TODO Auto-generated method stub
		this.entityManager.merge(requerimiento);
	}

}
