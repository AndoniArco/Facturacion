package com.desarrollo.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.desarrollo.modelo.Cliente;

@Service
public interface I_AlumnoServicio {

	public List<Cliente> obtenerTodos();
	public Cliente obtenerPorId(Integer id);
	public Cliente insertar(Cliente alu);
	public Cliente Modificar(Cliente alu);
	public void borrar(Integer id);
	
}
