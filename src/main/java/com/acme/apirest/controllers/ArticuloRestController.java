package com.acme.apirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.apirest.models.entity.Articulo;
import com.acme.apirest.models.services.IArticuloService;

// Falta el CORS
@RestController
@RequestMapping("/api") // Ruta del endpoint de la API
public class ArticuloRestController {
    
    @Autowired
    private IArticuloService articuloService;

    @PostMapping("/articulos")
    public Articulo create(@RequestBody Articulo articulo) {
        return articuloService.save(articulo);
    }

}
