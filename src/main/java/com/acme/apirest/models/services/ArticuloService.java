package com.acme.apirest.models.services;

import java.util.List;

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
    @Transactional(readOnly = true)
    public List<Articulo> findAll() {
        return (List<Articulo>) articuloDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<Articulo> searchArticulosByModelo(String term) {
        return (List<Articulo>) articuloDAO.searchArticulosByModelo(term);
    }


    @Override
    @Transactional()
    public Articulo save(Articulo articulo) {
        return articuloDAO.save(articulo);
    }
    
}
