package com.ec.repository;

import org.springframework.stereotype.Repository;

import com.ec.entity.Proveedor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProveedorRepoImpl implements IProveedorRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void crearProveedor(Proveedor proveedor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(proveedor);
	}

	@Override
	public Proveedor buscarProveedor(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Proveedor.class, id);
	}

	@Override
	public void borrarProveedor(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.entityManager.find(Proveedor.class, id));
	}

	@Override
	public void actualizarRepuesto(Proveedor proveedor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(proveedor);
	}

	
	
	
}
