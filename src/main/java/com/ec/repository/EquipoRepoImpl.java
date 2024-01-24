package com.ec.repository;

import org.springframework.stereotype.Repository;

import com.ec.entity.Equipo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class EquipoRepoImpl implements IEquipoRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void crearEquipo(Equipo equipo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(equipo);
	}

	@Override
	public Equipo buscarEquipo(Integer id) {
		// TODO Auto-generated method stub
		
		Equipo equipo =this.entityManager.find(Equipo.class, id);
		return equipo;
		
	}

	@Override
	public void actualizarEquipo(Equipo equipo) {
		// TODO Auto-generated method stub
		
		this.entityManager.merge(equipo);
		
	}

	@Override
	public void borrarEquipo(Integer id) {
		// TODO Auto-generated method stub
		
		Equipo equipo = this.entityManager.find(Equipo.class, id);
		this.entityManager.remove(equipo);
		
	}

}
