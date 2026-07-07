package com.desarrollo.modelo;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

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
	@Column(nullable = false)
	private int importe;
	@ManyToOne
	@JoinColumn(name = "cliente_id", nullable = false)
	private Cliente cliente;
	@OneToMany(mappedBy = "factura", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<Servicio> servicios;

	public Factura(int id, LocalDate fecha, String descripcion, int importe, Cliente alumno) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.importe = importe;
		this.cliente = alumno;
	}

	public Factura() {
		id = 0;
		fecha = LocalDate.now(ZoneId.systemDefault());
		descripcion = "";
		importe = 0;
		cliente = new Cliente();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getImporte() {
		return importe;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}

	public Cliente getAlumno() {
		return cliente;
	}

	public void setAlumno(Cliente alumno) {
		this.cliente = alumno;
	}
	
    public void addServicio(Servicio servicio) {
        servicios.add(servicio);
        servicio.setFactura(this);
    }

    public void removeServicio(Servicio servicio) {
        servicios.remove(servicio);
        servicio.setFactura(null);
    }

	@Override
	public String toString() {
		return "Factura [id=" + id + ", fecha=" + fecha + ", descripcion=" + descripcion + ", importe=" + importe
				+ ", alumno=" + cliente + "]";
	}

}
