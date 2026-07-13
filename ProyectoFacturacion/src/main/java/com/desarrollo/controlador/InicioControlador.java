package com.desarrollo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.desarrollo.modelo.Usuario;

@Controller
public class InicioControlador {
	
	@GetMapping("/")
	public String cargarInicio(Model model) {
		
		model.addAttribute("obj_usuario", new Usuario() );
		return "home";
	}
	

}