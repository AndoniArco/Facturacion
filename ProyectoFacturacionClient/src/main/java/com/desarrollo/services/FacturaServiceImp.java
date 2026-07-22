package com.desarrollo.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.desarrollo.pojo.Factura;

@Service
public class FacturaServiceImp implements I_FacturaServicie{
	
	private RestTemplate restTemplate= new RestTemplate();
	private String URL= "http://localhost:9090/api/v1/facturas/";

	@Override
	public List<Factura> obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Factura obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Factura insertar(Factura fact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Factura modificar(Factura fact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
