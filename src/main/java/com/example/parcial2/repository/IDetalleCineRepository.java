package com.example.parcial2.repository;

import com.example.parcial2.DetalleCine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDetalleCineRepository extends JpaRepository<DetalleCine, Long>{

    // Consulta personalizada: buscar detalle por teléfono
    DetalleCine findByTelefono(String telefono);
}
