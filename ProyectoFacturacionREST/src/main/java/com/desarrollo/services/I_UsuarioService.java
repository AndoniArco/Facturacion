package com.desarrollo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.desarrollo.modelo.Usuario;

@Service
public interface I_UsuarioService {
	
	public List<Usuario> obtenerTodos();
	public Usuario obtenerPorId(Integer id);
	public Usuario insertar(Usuario usu);
	public Usuario modificar(Usuario usu);
	public void borrar(Integer id);
	
	public Usuario obtenerUsuarioPorNombre(String usu);
	public String validarUsuario(String usu, String contra);//devuelve Token
	public Usuario bloquearUsuario(Usuario usuarioTemp);

}
