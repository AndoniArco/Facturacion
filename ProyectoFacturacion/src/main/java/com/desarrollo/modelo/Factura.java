package com.desarrollo.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "facturas")
public class Factura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private LocalDate fecha;
	@Column(nullable = false, length = 255)
	private String descripcion;
	@Column(nullable = false, precision = 10, scale = 2)
	private BigDecimal importe;
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "cliente_id", nullable = false)
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
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
