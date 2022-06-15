package com.acme.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acme.apirest.models.dao.IProveedorDAO;
import com.acme.apirest.models.entity.Proveedor;

@Service
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

    @Override
    @Transactional(readOnly = true)
    public Page<Proveedor> findAll(Pageable pageable) {
        return proveedorDAO.findAll(pageable);
    }

    @Override
    @Transactional()
    public Proveedor save(Proveedor proveedor) {
        return proveedorDAO.save(proveedor);
    }

}
