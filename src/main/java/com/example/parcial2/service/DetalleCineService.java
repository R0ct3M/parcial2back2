package com.example.parcial2.service;

import com.example.parcial2.DetalleCine;
import com.example.parcial2.repository.IDetalleCineRepository;
import org.springframework.stereotype.Service;

@Service
public class DetalleCineService {

    private final IDetalleCineRepository detalleCineRepository;

    // Inyección de dependencias por constructor
    public DetalleCineService(IDetalleCineRepository detalleCineRepository) {
        this.detalleCineRepository = detalleCineRepository;
    }

    // Crear o actualizar un Detalle
    public DetalleCine save(DetalleCine detalleCine){
        return detalleCineRepository.save(detalleCine);
    }

    // Consulta de detalles por teléfono
    public DetalleCine findByTelefono(String telefono) {
        return detalleCineRepository.findByTelefono(telefono);
    }

}
