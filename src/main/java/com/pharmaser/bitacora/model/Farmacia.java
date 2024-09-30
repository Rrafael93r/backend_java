package com.pharmaser.bitacora.model;

import jakarta.persistence.*;


@Entity
@Table(name = "Farmacia")
public class Farmacia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String cordenadas;
    private String direccion;
    private String ciudad;
    private String departamento;
    private String tipoServicio;
    private String idServicioContratado;
    private String anchoBanda;
    private String medioCanalPrincipal;
    private Double costeMes;
    private Double costeAnual;

    @ManyToOne
    @JoinColumn(name = "proveedor_old_id")
    private Proveedor proveedorOld;

    @ManyToOne
    @JoinColumn(name = "proveedor_actual_id")
    private Proveedor proveedorActual;



    @Column(unique = true)
    private String nit;

    private String correo;
    private String nombreContacto;
    private String numeroContacto;
    private String regenteSaf;
    private String contactoRegenteSaf;
    private String pertenece;


    public String getAnchoBanda() {
        return anchoBanda;
    }

    public void setAnchoBanda(String anchoBanda) {
        this.anchoBanda = anchoBanda;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCordenadas() {
        return cordenadas;
    }

    public void setCordenadas(String cordenadas) {
        this.cordenadas = cordenadas;
    }

    public String getContactoRegenteSaf() {
        return contactoRegenteSaf;
    }

    public void setContactoRegenteSaf(String contactoRegenteSaf) {
        this.contactoRegenteSaf = contactoRegenteSaf;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Double getCosteMes() {
        return costeMes;
    }

    public void setCosteMes(Double costeMes) {
        this.costeMes = costeMes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Proveedor getProveedorActual() {
        return proveedorActual;
    }

    public void setProveedorActual(Proveedor proveedorActual) {
        this.proveedorActual = proveedorActual;
    }

    public String getPertenece() {
        return pertenece;
    }

    public void setPertenece(String pertenece) {
        this.pertenece = pertenece;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
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

    public String getMedioCanalPrincipal() {
        return medioCanalPrincipal;
    }

    public void setMedioCanalPrincipal(String medioCanalPrincipal) {
        this.medioCanalPrincipal = medioCanalPrincipal;
    }

    public String getIdServicioContratado() {
        return idServicioContratado;
    }

    public void setIdServicioContratado(String idServicioContratado) {
        this.idServicioContratado = idServicioContratado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Double getCosteAnual() {
        return costeAnual;
    }

    public void setCosteAnual(Double costeAnual) {
        this.costeAnual = costeAnual;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getRegenteSaf() {
        return regenteSaf;
    }

    public void setRegenteSaf(String regenteSaf) {
        this.regenteSaf = regenteSaf;
    }

    public Proveedor getProveedorOld() {
        return proveedorOld;
    }

    public void setProveedorOld(Proveedor proveedorOld) {
        this.proveedorOld = proveedorOld;
    }
}

