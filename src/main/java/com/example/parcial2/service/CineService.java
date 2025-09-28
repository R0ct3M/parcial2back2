package com.example.parcial2.service;

import com.example.parcial2.Cine;
import com.example.parcial2.dto.CineDTO;
import com.example.parcial2.mapper.CineMapper;
import com.example.parcial2.repository.ICineRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CineService {

    private final ICineRepository cineRepository;

    public CineService(ICineRepository cineRepository) {
        this.cineRepository = cineRepository;
    }

    // Crear o actualizar un cine
    public CineDTO save(CineDTO cineDTO) {
        Cine cine = CineMapper.toEntity(cineDTO);
        Cine cineGuardado = cineRepository.save(cine);
        return CineMapper.toDTO(cineGuardado);
    }

    // buscar cines por ciudad, donde retorna DTO
    public List<CineDTO> findByCiudad(String ciudad) {
        return cineRepository.findByCiudad(ciudad)
                .stream()
                .map(CineMapper::toDTO)
                .collect(Collectors.toList());
    }

    //Buscar todos los cines en formato DTO
    public  List<CineDTO> findAll() {
        return cineRepository.findAll()
                .stream()
                .map(CineMapper::toDTO)
                .collect(Collectors.toList());
    }
}
