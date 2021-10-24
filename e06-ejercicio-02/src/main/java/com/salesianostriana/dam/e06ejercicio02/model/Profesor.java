package com.salesianostriana.dam.e06ejercicio02.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor @Builder
@Getter @Setter @ToString
public class Profesor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private double puntuacion;

    @OneToMany(mappedBy = "profesor")
    private List<CursoOnline> cursosOnline = new ArrayList<>();


}
