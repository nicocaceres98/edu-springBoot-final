package com.example.eduspringBootfinal.repository;

import com.example.eduspringBootfinal.entities.Orden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenRepository extends JpaRepository<Orden, Long> {
}
