package com.desarrollo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desarrollo.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
