package com.desarrollo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desarrollo.modelo.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Integer>{

}
