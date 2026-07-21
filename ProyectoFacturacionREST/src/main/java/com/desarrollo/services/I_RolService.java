package com.desarrollo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.desarrollo.modelo.Rol;

@Service
public interface I_RolService {
	
	public List<Rol> obtenerTodos();
	public Rol obtenerPorId(Integer id);
	public Rol insertar(Rol rol);
	public Rol modificar(Rol rol);
	public void borrar(Integer id);

}
