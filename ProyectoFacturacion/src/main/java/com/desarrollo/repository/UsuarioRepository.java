package com.desarrollo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desarrollo.modelo.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	public Optional<Usuario> findByUser (String usu);
	public Boolean existsByUserAndPass(String usu, String pas);

}
