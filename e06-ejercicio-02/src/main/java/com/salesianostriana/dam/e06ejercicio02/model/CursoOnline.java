package com.salesianostriana.dam.e06ejercicio02.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor @Builder
@Getter @Setter
public class CursoOnline implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private double puntuacion;


    @OneToMany(mappedBy = "cursoOnline", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Video> videos = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    private Profesor profesor;

    public void addProfesor(Profesor p) {
        this.profesor = p;
        p.getCursosOnline().add(this);
    }

    public void removeProfesor(Profesor p) {
        p.getCursosOnline().remove(this);
        this.profesor = null;
    }






}
