package com.salesianostriana.dam.e06ejercicio01.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter @Setter
public class Categoria {

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;

    @OneToMany(mappedBy = "categoria", fetch = FetchType.EAGER)
    private List<Producto> productos = new ArrayList<>();

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "categoriaPadre")
    private Categoria categoriaPadre;


    @OneToMany(mappedBy = "categoriaPadre")
    private List<Categoria> categorias = new ArrayList<>();



}
