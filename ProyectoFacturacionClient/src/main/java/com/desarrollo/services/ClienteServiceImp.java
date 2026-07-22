package com.desarrollo.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.desarrollo.pojo.Cliente;

@Service
public class ClienteServiceImp implements I_ClienteService{
	
	private RestTemplate restTemplate= new RestTemplate();
	private String URL= "http://localhost:9090/api/v1/clientes/";

	@Override
	public List<Cliente> obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente insertar(Cliente client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente modificar(Cliente client) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
