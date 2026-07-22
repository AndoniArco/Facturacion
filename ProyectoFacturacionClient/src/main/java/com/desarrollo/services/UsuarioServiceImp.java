package com.desarrollo.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.desarrollo.pojo.Usuario;

@Service
public class UsuarioServiceImp implements I_UsuarioService{
	
	private RestTemplate restTemplate= new RestTemplate();
	private String URL= "http://localhost:9090/api/v1/usuarios/";

	@Override
	public List<Usuario> obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario insertar(Usuario usu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario modificar(Usuario usu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario obtenerUsuarioPorNombre(String usu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String validarUsuario(String usu, String contra) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario bloquearUsuario(Usuario usuarioTemp) {
		// TODO Auto-generated method stub
		return null;
	}

}
