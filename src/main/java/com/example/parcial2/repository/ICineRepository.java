package com.example.parcial2.repository;

import com.example.parcial2.Cine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICineRepository extends JpaRepository<Cine, Long> {

    // Consulta personalizada: buscar cines por ciudad
    @Query("SELECT c FROM Cine c JOIN c.detalle d WHERE d.ciudad = :ciudad")
    List<Cine> findByCiudad(String ciudad);
}