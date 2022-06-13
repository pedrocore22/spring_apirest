package com.acme.apirest.models.services;

import java.util.List;

import com.acme.apirest.models.entity.Proveedor;

public interface IProveedorService {
    // Esta interfaz define los métodos que tendrá
    // que implementar nuestro servicio de proveedores
    public List<Proveedor> findAll();
}
