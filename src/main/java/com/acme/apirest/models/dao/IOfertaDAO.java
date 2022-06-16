package com.acme.apirest.models.dao;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.acme.apirest.models.entity.Oferta;

public interface IOfertaDAO extends CrudRepository<Oferta, UUID> {
    // Métodos específicos
}
