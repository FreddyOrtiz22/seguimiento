package com.ec.repository;

import org.springframework.stereotype.Repository;

import com.ec.entity.DetalleRequerimiento;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DetalleRequerimientoRepoImpl implements IDetalleRequerimientoRepo{

	//Funciona como un cable --- gestion a las entitys
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void crearDetalleRequerimiento(DetalleRequerimiento deta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(deta);
	}

	@Override
	public DetalleRequerimiento buscarDetalle(Integer id) {
		// TODO Auto-generated method stub
		
		//DetalleRequerimiento detalle = this.entityManager.find(DetalleRequerimiento.class, id);
		//return detalle;
		
		return this.entityManager.find(DetalleRequerimiento.class, id);
	}

	@Override
	public void actualizarDetalleRequerimiento(DetalleRequerimiento deta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(deta);
	}

	@Override
	public void borrarDetalleRequerimiento(Integer id) {
		// TODO Auto-generated method stub
		
//		DetalleRequerimiento detalle = this.entityManager.find(DetalleRequerimiento.class, id);
//		this.entityManager.remove(detalle);
		
//		this.entityManager.remove(this.entityManager.find(DetalleRequerimiento.class, id));
		
		this.entityManager.remove(this.buscarDetalle(id));
	}
	

}
