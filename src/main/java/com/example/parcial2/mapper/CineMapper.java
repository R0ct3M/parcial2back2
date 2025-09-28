package com.example.parcial2.mapper;

import com.example.parcial2.Cine;
import com.example.parcial2.dto.CineDTO;

public class CineMapper {

    // De entidad a DTO
    public static CineDTO toDTO(Cine cine) {
        return new CineDTO(
                cine.getId(),
                cine.getNombre(),
                cine.getCiudad()
        );
    }

    // De DTO a entidad
    public static Cine toEntity(CineDTO cineDTO) {
        Cine cine = new Cine();
        cine.setId(cineDTO.getId());
        cine.setNombre(cineDTO.getNombre());
        cine.setCiudad(cineDTO.getCiudad());
        return cine;
    }
}
