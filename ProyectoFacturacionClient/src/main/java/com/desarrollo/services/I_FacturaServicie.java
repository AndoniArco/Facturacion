package com.desarrollo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.desarrollo.pojo.Factura;

@Service
public interface I_FacturaServicie {
	
	public List<Factura> obtenerTodos();
	public Factura obtenerPorId(Integer id);
	public Factura insertar(Factura fact);
	public Factura modificar(Factura fact);
	public void borrar(Integer id);

}
