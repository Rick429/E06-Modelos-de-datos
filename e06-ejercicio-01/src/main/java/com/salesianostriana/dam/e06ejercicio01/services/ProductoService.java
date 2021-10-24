package com.salesianostriana.dam.e06ejercicio01.services;

import com.salesianostriana.dam.e06ejercicio01.model.Producto;
import com.salesianostriana.dam.e06ejercicio01.repository.ProductoRepository;
import com.salesianostriana.dam.e06ejercicio01.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProductoService extends BaseService<Producto, Long, ProductoRepository> {
}
