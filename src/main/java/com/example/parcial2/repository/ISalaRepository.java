package com.example.parcial2.repository;

import com.example.parcial2.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ISalaRepository extends JpaRepository<Sala, Long>{


    // Consulta personalizada: buscar salas por tipo (ej: 2D, 3D, IMAX)
    List<Sala> findByTipo(String tipo);
}
