package com.desarrollo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.desarrollo.modelo.Factura;

@Service
public interface I_FacturaServicie {
	
	public List<Factura> obtenerTodos();
	public Factura obtenerPorId(Integer id);
	public Factura insertar(Factura alu);
	public Factura modificar(Factura alu);
	public void borrar(Integer id);

}
