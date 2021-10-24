package com.salesianostriana.dam.e06ejercicio01.model;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor @Builder
@Getter @Setter @ToString
public class Producto {

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private double pvp;

    @ManyToOne
    @JoinColumn(name = "categoria", foreignKey = @ForeignKey(name = "FK_PRODUCTO_CATEGORIA"))
    private Categoria categoria;


    public void addCategoria(Categoria c) {
        this.categoria = c;
        c.getProductos().add(this);
    }

    public void removeCategoria(Categoria c) {
        c.getProductos().remove(this);
        this.categoria = null;
    }
}
