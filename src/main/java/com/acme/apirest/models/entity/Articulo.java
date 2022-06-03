package com.acme.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

@Entity
@Table(name="articulos")
public class Articulo implements Serializable {
    
    @Id // Clave única de la tabla
    @GeneratedValue // Valor lo genere automáticamente
    @Type(type="org.hibernate.type.UUIDCharType")
    private UUID id;
    @Column(length = 4, unique = true, nullable = false)
    private String sku;
    @Column(nullable = false)
    private String marca;
    @Column(nullable = false)
    private String modelo;
    // Si no tiene ninguna constraint no hace falta usar @Column
    private String descripcion;
    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false)
    private Genero genero;
    @Column(name = "fecha_alta")
    @Temporal(TemporalType.DATE)
    private Date fechaAlta;

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getSku() {
        return sku;
    }
    public void setSku(String sku) {
        this.sku = sku;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public Date getFechaAlta() {
        return fechaAlta;
    }
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    private static final long serialVersionUID = 1L;
}
