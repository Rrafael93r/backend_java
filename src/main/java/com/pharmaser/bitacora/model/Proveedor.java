package com.pharmaser.bitacora.model;

import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "Proveedor")
public class Proveedor {

    @Id
    private String nit;

    private String nombre;
    private String nombreContacto;
    private String numeroContacto;
    private String numero2Contacto;
    private String correo;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private Boolean estado;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getNumero2Contacto() {
        return numero2Contacto;
    }

    public void setNumero2Contacto(String numero2Contacto) {
        this.numero2Contacto = numero2Contacto;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }
}
