package com.desarrollo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.desarrollo.modelo.Rol;
import com.desarrollo.repository.RolRepository;

public class RolService implements I_RolService {

	@Autowired
	private RolRepository rolRepo;

	@Override
	public List<Rol> obtenerTodos() {
		try {
			return rolRepo.findAll();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Rol obtenerPorId(Integer id) {
		try {
			return rolRepo.findById(id).orElse(new Rol());
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Rol insertar(Rol rol) {
		try {
			if (rol.getId() == 0) {
				return rolRepo.save(rol);
			}
			return new Rol();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Rol modificar(Rol rol) {
		try {
			if (rol.getId() > 0) {
				return rolRepo.save(rol);
			}
			return new Rol();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public void borrar(Integer id) {
		try {
			rolRepo.deleteById(id);
		} catch (Exception e) {

		}
	}

}
