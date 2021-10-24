package com.salesianostriana.dam.e06ejercicio02.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor @Builder
@Getter @Setter
public class Video implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int orden;
    private String titulo;
    private String descripcion;
    private String url;

    @ManyToOne
    private CursoOnline cursoOnline;

    public void addCurso(CursoOnline c) {
        this.cursoOnline = c;
        c.getVideos().add(this);
    }

    public void removeCurso(CursoOnline c) {
        c.getVideos().remove(this);
        this.cursoOnline = null;
    }


}
