package com.acme.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.apirest.models.entity.Proveedor;
import com.acme.apirest.models.services.IProveedorService;

@CrossOrigin(origins={"http://localhost:4200"}) // Permitir peticiones y desbloquear el CORS del navegador
@RestController
@RequestMapping("/api")
public class ProveedorRestController {
    
    @Autowired
    private IProveedorService proveedorService;

    // @GetMapping("/proveedores")
    // public List<Proveedor> index() {
    //     return proveedorService.findAll();
    // }

}
