package com.ec.repository;

import org.springframework.stereotype.Repository;

import com.ec.entity.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UsuariosRepoImpl implements IUsuarioRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void crearUsuario(Usuario usuario) {
		this.entityManager.persist(usuario);
	}

	@Override
	public Usuario buscarUsuario(Integer id) {
		// TODO Auto-generated method stub
		Usuario user = this.entityManager.find(Usuario.class, id);
		return user;
	}

	@Override
	public void borrarUsuario(Integer id) {
		this.entityManager.remove(this.buscarUsuario(id));
	}

	@Override
	public void actualizarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		this.entityManager.merge(usuario);
	}

	public void elimiimar() {
		
	}

}
