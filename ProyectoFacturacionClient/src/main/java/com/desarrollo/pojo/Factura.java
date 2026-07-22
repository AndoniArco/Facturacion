package com.desarrollo.pojo;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Factura {
	
	private int id;
	private LocalDate fecha;
	private String descripcion;
	private BigDecimal importe;
	private Cliente cliente;
	private Usuario usuario;
	
	public Factura() {
		id = 0;
		fecha = LocalDate.now();
		descripcion = "";
		importe = new BigDecimal("0.0");
		cliente = new Cliente();
		usuario = new Usuario();
	}
}
