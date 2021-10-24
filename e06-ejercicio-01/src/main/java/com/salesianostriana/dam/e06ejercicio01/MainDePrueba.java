package com.salesianostriana.dam.e06ejercicio01;


import com.salesianostriana.dam.e06ejercicio01.model.Categoria;
import com.salesianostriana.dam.e06ejercicio01.model.Producto;
import com.salesianostriana.dam.e06ejercicio01.services.CategoriaService;
import com.salesianostriana.dam.e06ejercicio01.services.ProductoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final CategoriaService categoriaService;
    private final ProductoService productoService;

    @PostConstruct
    public void test() {


        Categoria c1 = Categoria.builder()
                .nombre("Bebidas")
                .productos(new ArrayList<>())
                .build();

        Categoria c2 = Categoria.builder()
                .nombre("Bebidas con gas")
                .categoriaPadre(c1)
                .productos(new ArrayList<>())
                .build();


        Producto p1 = Producto.builder()
                .nombre("Coca cola")
                .pvp(1.90)
                .build();

        p1.addCategoria(c2);

        categoriaService.save(c1);
        categoriaService.save(c2);
        productoService.save(p1);



        System.out.println("\nID Categoria: "+c1.getId()+"\nNombre: "+c1.getNombre()+"\nID Categoria Padre: Null");
        System.out.println("\nID Categoria: "+c2.getId()+"\nNombre: "+c2.getNombre()+"\nID Categoria Padre: "+ c2.getCategoriaPadre().getId());
        System.out.println("\nID prodicto: "+p1.getId()+"\nNombre: "+p1.getNombre()+"\nPvp: "+p1.getPvp()+"\nID categoria: "+p1.getCategoria().getId()+"\nCategoria: "+ p1.getCategoria().getNombre());





    }

}
