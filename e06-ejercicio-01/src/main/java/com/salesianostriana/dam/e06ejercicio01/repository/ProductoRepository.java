package com.salesianostriana.dam.e06ejercicio01.repository;

import com.salesianostriana.dam.e06ejercicio01.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
