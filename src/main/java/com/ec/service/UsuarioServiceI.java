package com.ec.service;

import com.ec.entity.Usuario;

public interface UsuarioServiceI {
	void guardarUsuario(Usuario usuario);
	Usuario buscarUsuario(Integer id);
	void borrarUsuario(Integer id);
	void actualizarUsuario(Usuario usuario);
}
