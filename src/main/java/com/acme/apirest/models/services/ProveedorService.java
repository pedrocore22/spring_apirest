package com.acme.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.acme.apirest.models.dao.IProveedorDAO;
import com.acme.apirest.models.entity.Proveedor;

public class ProveedorService implements IProveedorService {
    // Aquí declaramos los métodos exigidos por la interfaz
    // y los enlazamos con los métodos que proporciona el DAO

    @Autowired // Con esta anotación le decimos que usaremos
    private IProveedorDAO proveedorDAO; // el DAO de proveedor

    // A continuación declaramos nuestros métodos

    @Override
    @Transactional(readOnly = true)
    public List<Proveedor> findAll() {
        return (List<Proveedor>) proveedorDAO.findAll();
    }
}
