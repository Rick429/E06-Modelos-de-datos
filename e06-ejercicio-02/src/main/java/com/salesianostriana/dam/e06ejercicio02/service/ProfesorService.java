package com.salesianostriana.dam.e06ejercicio02.service;

import com.salesianostriana.dam.e06ejercicio02.model.Profesor;
import com.salesianostriana.dam.e06ejercicio02.repository.ProfesorRepository;
import com.salesianostriana.dam.e06ejercicio02.service.base.BaseService;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class ProfesorService extends BaseService<Profesor, Long, ProfesorRepository> {
}
