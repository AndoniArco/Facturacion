package com.desarrollo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.desarrollo.pojo.Cliente;

@Service
public interface I_ClienteService {

	public List<Cliente> obtenerTodos();
	public Cliente obtenerPorId(Integer id);
	public Cliente insertar(Cliente client);
	public Cliente modificar(Cliente client);
	public void borrar(Integer id);
	
}
