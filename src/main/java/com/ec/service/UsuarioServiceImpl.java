package com.ec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec.entity.Usuario;
import com.ec.repository.UsuariosRepoI;

@Service
public class UsuarioServiceImpl implements UsuarioServiceI{

	@Autowired
	private UsuariosRepoI usuariosRepoI;


	@Override
	public Usuario buscarUsuario(Integer id) {

		return this.usuariosRepoI.buscarUsuario(id);
	}

	@Override
	public void borrarUsuario(Integer id) {
		// TODO Auto-generated method stub
		this.usuariosRepoI.borrarUsuario(id);
	}

	@Override
	public void actualizarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		this.usuariosRepoI.actualizarUsuario(usuario);
	}

	@Override
	public void guardarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		this.usuariosRepoI.crearUsuario(usuario);
	}

	
	
	
}
