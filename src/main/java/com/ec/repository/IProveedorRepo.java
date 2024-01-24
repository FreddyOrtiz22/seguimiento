package com.ec.repository;


import com.ec.entity.Proveedor;

public interface IProveedorRepo {

	void crearProveedor(Proveedor proveedor);
	Proveedor buscarProveedor(Integer id);
	void borrarProveedor(Integer id);
	void actualizarRepuesto(Proveedor proveedor);
	
}
