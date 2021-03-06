package com.acme.apirest.models.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.acme.apirest.models.entity.Articulo;

// La interfaz que heredamos solamente necesita (de momento)
// que le pasemos la clase de la entidad y el tipo de
// dato de su clave primaria
public interface IArticuloDAO extends CrudRepository<Articulo, UUID> {
    // Definiremos métodos propios más adelante
    @Query(value = "SELECT * FROM articulos WHERE modelo LIKE :term%", nativeQuery = true)
    public List<Articulo> searchArticulosByModelo(String term);
}
