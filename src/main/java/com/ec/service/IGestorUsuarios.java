package com.ec.service;

import java.util.List;

import com.ec.entity.Usuario;

public interface IGestorUsuarios {

	void ingresarUsuario(String nombre, String apellido, String cedula, String email, String telefono, String direccion, String tipo);
	List<Usuario> buscarTodosUsuario();
	
}
