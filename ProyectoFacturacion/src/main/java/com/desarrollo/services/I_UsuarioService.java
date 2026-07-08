package com.desarrollo.services;

import java.util.List;

import com.desarrollo.modelo.Usuario;

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
