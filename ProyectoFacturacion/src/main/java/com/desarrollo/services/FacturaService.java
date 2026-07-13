package com.desarrollo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.desarrollo.modelo.Factura;
import com.desarrollo.repository.FacturaRepository;

public class FacturaService implements I_FacturaServicie {

	@Autowired
	private FacturaRepository factuRepo;

	@Override
	public List<Factura> obtenerTodos() {
		try {
			return factuRepo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Factura obtenerPorId(Integer id) {
		try {
			return factuRepo.findById(id).orElse(new Factura());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Factura insertar(Factura fact) {
		try {
			if (fact.getId() == 0) {
				return factuRepo.save(fact);
			} else {
				return new Factura();
			}
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Factura modificar(Factura fact) {
		try {
			if (fact.getId() > 0) {
				return factuRepo.save(fact);
			} else {
				return new Factura();
			}
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public void borrar(Integer id) {
		try {
			factuRepo.deleteById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
