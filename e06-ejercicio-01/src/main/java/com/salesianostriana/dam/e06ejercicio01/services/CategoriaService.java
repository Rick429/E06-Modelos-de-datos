package com.salesianostriana.dam.e06ejercicio01.services;

import com.salesianostriana.dam.e06ejercicio01.model.Categoria;
import com.salesianostriana.dam.e06ejercicio01.repository.CategoriaRepository;
import com.salesianostriana.dam.e06ejercicio01.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService extends BaseService<Categoria, Long, CategoriaRepository> {
}
