package com.desarrollo.modelo;

import com.desarrollo.auxiliar.Auxiliar;

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
@Table(name="usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="user", nullable = false, length = 45, unique = true)
	private String user;
	
	@Column(name="pass", nullable = false, length = 255)
	private String pass;
	
	@Column(name="salt", nullable = false, length = 255)
	private String salt;
	
	@ManyToOne
	@JoinColumn
	private Rol rol;

	
	public Usuario() { 
		super();
		this.id = 0;
		this.user = "";
		this.pass = "";
		this.salt = Auxiliar.generarHexRandom(16);
		this.rol = new Rol();
	}
	

}