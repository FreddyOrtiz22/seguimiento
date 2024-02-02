package com.ec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ec.entity.Usuario;
import com.ec.service.IGestorUsuarios;
import com.ec.service.IUsuarioService;

@SpringBootApplication
public class SeguimientoApplication implements CommandLineRunner{

	@Autowired
	private	IGestorUsuarios iGestorUsuarios;
	
	public static void main(String[] args) {
		SpringApplication.run(SeguimientoApplication.class, args);
	}

	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//this.iGestorUsuarios.ingresarUsuario("gonzalo", "ortiz", "1715078984", "email.com", "0983193863", "UCE", "tecnico");
		
		System.out.println(this.iGestorUsuarios.buscarTodosUsuario());
		
	}

}
