package com.example.parcial2;

import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name = "cines")
public class Cine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String nit;
    private String ciudad;

    @OneToOne(mappedBy = "cine")
    private DetalleCine detalle;

    @OneToMany(mappedBy = "cine")
    private List<Sala> salas;

    public Cine() {}

    public Cine(Long id, String nombre, String nit, String ciudad, DetalleCine detalle, List<Sala> salas) {
        this.id = id;
        this.nombre = nombre;
        this.nit = nit;
        this.ciudad = ciudad;
        this.detalle = detalle;
        this.salas = salas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public DetalleCine getDetalle() {
        return detalle;
    }

    public void setDetalle(DetalleCine detalle) {
        this.detalle = detalle;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }
}