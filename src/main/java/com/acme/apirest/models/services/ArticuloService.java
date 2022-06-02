package com.acme.apirest.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acme.apirest.models.dao.IArticuloDAO;
import com.acme.apirest.models.entity.Articulo;

@Service
public class ArticuloService implements IArticuloService {

    @Autowired
    private IArticuloDAO articuloDAO;

    @Override
    @Transactional()
    public Articulo save(Articulo articulo) {
        return articuloDAO.save(articulo);
    }
    
}
