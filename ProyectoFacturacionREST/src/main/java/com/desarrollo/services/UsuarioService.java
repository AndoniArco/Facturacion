package com.desarrollo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desarrollo.componente.JwtUtil;
import com.desarrollo.modelo.Rol;
import com.desarrollo.modelo.Usuario;
import com.desarrollo.repository.UsuarioRepository;
@Service
public class UsuarioService implements I_UsuarioService{
	
	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private UsuarioRepository usuarioRepo;

	@Override
	public List<Usuario> obtenerTodos() {
		try {
			return usuarioRepo.findAll();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		try {
			return usuarioRepo.findById(id).orElse(new Usuario());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Usuario insertar(Usuario usu) {
		try {
			if (usu.getId()==0) {
				 return usuarioRepo.save(usu);
			}
			return new Usuario();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Usuario modificar(Usuario usu) {
		try {
			if (usu.getId()>0) {
				 return usuarioRepo.save(usu);
			}
			return new Usuario();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public void borrar(Integer id) {
		try {
			usuarioRepo.deleteById(id);
		} catch (Exception e) {
			
		}
	}

	@Override
	public Usuario obtenerUsuarioPorNombre(String usu) {
		try {
			return usuarioRepo.findByUser(usu).orElse(new Usuario());
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public String validarUsuario(String usu, String contra) {
		try {
			Boolean resultado = usuarioRepo.existsByUserAndPass(usu, contra);

			if (resultado) {
				Usuario usuTemp=usuarioRepo.findByUser(usu).orElse(new Usuario());
				return jwtUtil.generateToken(usu, usuTemp.getRol().getNombre());
			} else {
				return "";
			}
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Usuario bloquearUsuario(Usuario usuarioTemp) {
		try {
			Rol rol= new Rol(3, "BLOQUEADO");
			usuarioTemp.setRol(rol);
			return modificar(usuarioTemp);
		} catch (Exception e) {
			return null;
		}
	}

}
