package com.desarrollo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desarrollo.modelo.Rol;
import com.desarrollo.services.RolService;

@RestController
@RequestMapping("/api/v1/roles/")
public class RolControllerREST {
	
	@Autowired
	private RolService rolServ;

	@GetMapping("")
	public ResponseEntity<?> ontenerTodosRoles() {
		try {
			List<Rol> listaRoles = rolServ.obtenerTodos();

			if (listaRoles != null && listaRoles.size() > 0) {
				return ResponseEntity.ok(listaRoles);
			} else {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new Rol());
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("ErrorRoles1");
		}
	}

}
