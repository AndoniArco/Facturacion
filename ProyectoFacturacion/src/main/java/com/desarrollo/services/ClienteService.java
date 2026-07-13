package com.desarrollo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.desarrollo.modelo.Cliente;
import com.desarrollo.repository.ClienteRepository;

public class ClienteService implements I_ClienteService {

	@Autowired
	private ClienteRepository clientRepo;

	@Override
	public List<Cliente> obtenerTodos() {
		try {
			return clientRepo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public Cliente obtenerPorId(Integer id) {
		try {
			return clientRepo.findById(id).orElse(new Cliente());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Cliente insertar(Cliente client) {
		try {
			if (client.getId() == 0) {
				return clientRepo.save(client);
			} else {
				return new Cliente();
			}
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Cliente modificar(Cliente client) {
		try {
			if (client.getId() > 0) {
				return clientRepo.save(client);
			} else {
				return new Cliente();
			}
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public void borrar(Integer id) {
		try {
			clientRepo.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
