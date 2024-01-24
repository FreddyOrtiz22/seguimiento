package com.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec.entity.Usuario;
import com.ec.repository.IUsuarioRepo;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private IUsuarioRepo iUsuarioRepo;


	@Override
	public Usuario buscarUsuario(Integer id) {

		return this.iUsuarioRepo.buscarUsuario(id);
	}

	@Override
	public void borrarUsuario(Integer id) {
		// TODO Auto-generated method stub
		this.iUsuarioRepo.borrarUsuario(id);
	}

	@Override
	public void actualizarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		this.iUsuarioRepo.actualizarUsuario(usuario);
	}

	@Override
	public void guardarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		this.iUsuarioRepo.crearUsuario(usuario);

	}

	
	
	
}
