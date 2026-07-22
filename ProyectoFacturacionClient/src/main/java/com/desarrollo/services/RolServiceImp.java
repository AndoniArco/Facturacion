package com.desarrollo.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.desarrollo.pojo.Rol;

@Service
public class RolServiceImp implements I_RolService{
	
	private RestTemplate restTemplate= new RestTemplate();
	private String URL= "http://localhost:9090/api/v1/roles/";

	@Override
	public List<Rol> obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rol obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rol insertar(Rol rol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rol modificar(Rol rol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
