package com.desarrollo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "servicios")
public class Servicio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "cliente_id", nullable = false)
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name = "factura_id", nullable = false)
	private Factura factura;

	public Servicio(int id, Cliente cliente, Factura factura) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.factura = factura;
	}

	public Servicio() {
		id = 0;
		cliente = new Cliente();
		factura = new Factura();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getAlumno() {
		return cliente;
	}

	public void setAlumno(Cliente cliente) {
		this.cliente = cliente;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

}
