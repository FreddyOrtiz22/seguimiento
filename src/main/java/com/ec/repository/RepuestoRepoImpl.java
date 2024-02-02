package com.ec.repository;

import org.springframework.stereotype.Repository;

import com.ec.entity.Repuesto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class RepuestoRepoImpl implements IRepuestoRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void crearRepuesto(Repuesto repuesto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(repuesto);
	}

	@Override
	public Repuesto buscarRepuesto(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Repuesto.class, id);
	}

	@Override
	public void borrarRepuesto(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.entityManager.find(Repuesto.class, id));
	}

	@Override
	public void actualizarRepuesto(Repuesto repuesto) {
		// TODO Auto-generated method stub
		this.entityManager.merge(repuesto);
	}

}
