package com.example.eduspringBootfinal.repository;

import com.example.eduspringBootfinal.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
