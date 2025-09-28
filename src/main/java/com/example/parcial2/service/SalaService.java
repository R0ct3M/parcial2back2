package com.example.parcial2.service;


import com.example.parcial2.Sala;
import com.example.parcial2.repository.ISalaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaService {

    private final ISalaRepository salaRepository;

    public SalaService(ISalaRepository salaRepository) {
        this.salaRepository = salaRepository;
    }

    // Crear o actualizar una sala
    public Sala save(Sala sala) {
        return salaRepository.save(sala);
    }

    // Consulta de sala por tipo
    public List<Sala> findByTipo(String tipo) {
        return salaRepository.findByTipo(tipo);
    }

}
