package com.ec.repository;

import java.util.List;

import com.ec.entity.Usuario;

public interface IUsuarioRepo {

	void crearUsuario(Usuario usuario);
	Usuario buscarUsuario(Integer id);
	void borrarUsuario(Integer id);
	void actualizarUsuario(Usuario usuario);
	List<Usuario> buscarTodosUsuarios();
	Usuario buscarUsuarioCedula(String cedula);
	
}
