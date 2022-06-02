package com.acme.apirest.models.services;

import com.acme.apirest.models.entity.Articulo;

// En esta interfaz vamos a definir
// los métodos que usaremos en las
// operaciones de nuestra tabla articulos

public interface IArticuloService {
    
    // Método para crear nuevos articulos

    public Articulo save(Articulo articulo);

    // Resto de métodos

}
