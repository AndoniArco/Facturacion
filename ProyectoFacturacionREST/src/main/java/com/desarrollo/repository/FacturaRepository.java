package com.desarrollo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desarrollo.modelo.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Integer>{
	
	public List<Factura> findAllByUsuarioId(Integer id);

}
