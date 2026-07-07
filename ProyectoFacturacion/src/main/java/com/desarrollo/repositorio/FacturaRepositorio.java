package com.desarrollo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desarrollo.modelo.Factura;

public interface FacturaRepositorio extends JpaRepository<Factura, Integer>{

}
