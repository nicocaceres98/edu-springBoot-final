package com.example.eduspringBootfinal.repository;

import com.example.eduspringBootfinal.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
