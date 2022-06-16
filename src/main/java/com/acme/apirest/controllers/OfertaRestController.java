package com.acme.apirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.acme.apirest.models.entity.Oferta;
import com.acme.apirest.models.services.IOfertaService;

@CrossOrigin(origins={"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class OfertaRestController {
    
    @Autowired
    private IOfertaService ofertaService;

    @PostMapping("/ofertas")
    @ResponseStatus(HttpStatus.CREATED)
    public Oferta create(@RequestBody Oferta oferta) {
        return ofertaService.save(oferta);
    }

}
