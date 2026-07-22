package com.desarrollo.pojo;

import com.desarrollo.auxiliar.Auxiliar;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Usuario {
	
	private int id;
	private String user;
	private String pass;
	private String salt;
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