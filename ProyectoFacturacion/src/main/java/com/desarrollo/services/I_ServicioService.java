package com.desarrollo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.desarrollo.modelo.Servicio;

@Service
public interface I_ServicioService {

	public List<Servicio> obtenerTodos();
	public Servicio obtenerPorId(Integer id);
	public Servicio insertar(Servicio alu);
	public Servicio modificar(Servicio alu);
	public void borrar(Integer id);
}
