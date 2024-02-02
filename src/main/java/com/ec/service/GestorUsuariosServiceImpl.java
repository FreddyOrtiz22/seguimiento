package com.ec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec.entity.Usuario;
import com.ec.repository.IUsuarioRepo;

@Service
public class GestorUsuariosServiceImpl implements IGestorUsuarios{

	@Autowired
	private IUsuarioRepo iUsuarioRepo;

	//agregar cliente viendo como admin
	//la contrase;a sera el numero de cedula
	@Override
	public void ingresarUsuario(String nombre, String apellido, String cedula, String email, String telefono, String direccion, String tipo) {
		// TODO Auto-generated method stub
		
		Usuario user = new Usuario();
		//datos que se piden al ciente para registro manual
		user.setNombre(nombre);
		user.setApellido(apellido);
		user.setCedula(cedula);
		user.setEmail(email);
		user.setTelefono(telefono);
		user.setDireccion(direccion);
		user.setTipo(tipo);
		
		//atributos que el sistema asigna automaticamente
		user.setContrasena(cedula);
		
		if(tipo.equals("tecnico")) {
			user.setNumeroTecnico(cedula.substring(cedula.length()-3));
			user.setEstado("Disponible");
		}

		this.iUsuarioRepo.crearUsuario(user);
		
	}

	@Override
	public List<Usuario> buscarTodosUsuario() {
		// TODO Auto-generated method stub
		return this.iUsuarioRepo.buscarTodosUsuarios();
	}


	
	
	
	
}
