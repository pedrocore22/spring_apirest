package com.acme.apirest.models.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acme.apirest.models.entity.Proveedor;

public interface IProveedorDAO extends JpaRepository<Proveedor, UUID> {
    // Con esto tenemos los métodos "habituales" de CRUD
    // Y se podrán especificar otros "a medida"
}
