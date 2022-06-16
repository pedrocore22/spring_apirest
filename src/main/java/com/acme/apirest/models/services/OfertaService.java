package com.acme.apirest.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acme.apirest.models.dao.IOfertaDAO;
import com.acme.apirest.models.entity.Oferta;

@Service
public class OfertaService implements IOfertaService {

    @Autowired
    private IOfertaDAO ofertaDAO;

    @Override
    @Transactional()
    public Oferta save(Oferta oferta) {
        return ofertaDAO.save(oferta);
    }
    
}
