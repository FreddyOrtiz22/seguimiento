package com.ec.repository;

import com.ec.entity.Usuario;

public interface UsuariosRepoI {

	void crearUsuario(Usuario usuario);
	Usuario buscarUsuario(Integer id);
	void borrarUsuario(Integer id);
	void actualizarUsuario(Usuario usuario);
	
}
