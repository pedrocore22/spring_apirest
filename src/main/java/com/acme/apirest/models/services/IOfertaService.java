package com.acme.apirest.models.services;

import java.util.List;

import com.acme.apirest.models.entity.Oferta;

public interface IOfertaService {

    public List<Oferta> findByArticuloId(String articuloId);

    public Oferta save(Oferta oferta);
}
