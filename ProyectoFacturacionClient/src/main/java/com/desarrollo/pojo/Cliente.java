package com.desarrollo.pojo;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

	private int id;
	private String nombre;
	private String direccion;
	private List<Factura> facturas = new ArrayList<>();
}