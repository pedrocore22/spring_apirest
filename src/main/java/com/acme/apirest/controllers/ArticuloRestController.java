package com.acme.apirest.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.apirest.models.entity.Articulo;
import com.acme.apirest.models.services.IArticuloService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api") // Ruta del endpoint de la API
public class ArticuloRestController {
    
    @Autowired
    private IArticuloService articuloService;

    @GetMapping("/articulos")
    public ResponseEntity<?> read() {
        List<Articulo> articulos = articuloService.findAll();
        Map<String, Object> response = new HashMap<>();
        response.put("message", "ok");
        response.put("articulos", articulos);
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }

    @PostMapping("/articulos")
    public Articulo create(@RequestBody Articulo articulo) {
        return articuloService.save(articulo);
    }

}
