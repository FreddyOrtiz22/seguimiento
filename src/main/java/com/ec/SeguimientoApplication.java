package com.ec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ec.entity.Usuario;
import com.ec.service.UsuarioServiceI;

@SpringBootApplication
public class SeguimientoApplication implements CommandLineRunner{

	@Autowired
	private UsuarioServiceI usuarioServiceI;
	
	public static void main(String[] args) {
		SpringApplication.run(SeguimientoApplication.class, args);
	}

	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("imp");
		
		Usuario u=new Usuario();
		u.setApellido("Ortiz");
		u.setCedula("1234567");
		u.setTipo("Tecnico");
		
		//this.usuarioServiceI.guardarUsuario(u);
		
		//this.usuarioServiceI.borrarUsuario(3);
		
		//Usuario user = this.usuarioServiceI.buscarUsuario(1);
		//System.out.println(user);
		
		
	}

}
