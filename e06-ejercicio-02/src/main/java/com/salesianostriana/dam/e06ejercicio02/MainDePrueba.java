package com.salesianostriana.dam.e06ejercicio02;

import com.salesianostriana.dam.e06ejercicio02.model.CursoOnline;
import com.salesianostriana.dam.e06ejercicio02.model.Profesor;
import com.salesianostriana.dam.e06ejercicio02.model.Video;
import com.salesianostriana.dam.e06ejercicio02.repository.CursoOnlineRepository;
import com.salesianostriana.dam.e06ejercicio02.repository.ProfesorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final CursoOnlineRepository cursoOnlineRepository;
    private final ProfesorRepository profesorRepository;

    @PostConstruct
    public void test(){

        Profesor p1 = Profesor.builder()
                .nombre("Luis Miguel López Magaña")
                .email("luismi.lopez@salesianos.edu")
                .cursosOnline(new ArrayList<>())
                .puntuacion(4.5)
                .build();

        CursoOnline c1 = CursoOnline.builder()
                .nombre("Java 8 desde Cero")
                .puntuacion(4.39)
                .videos(new ArrayList<>())
                .build();

        Video v = Video.builder()
                .titulo("Presentación del profesor y curso")
                .descripcion("Conoce al profesor de Java desde 0, los requisitos y los objetivos del curso.")
                .orden(1)
                .url("https://openwebinars.net/academia/aprende/java/2860/")
                .build();


        v.addCurso(c1);
        c1.addProfesor(p1);
        cursoOnlineRepository.save(c1);
        profesorRepository.save(p1);

        System.out.println("ID profesor: "+p1.getId()+"\nNombre: "+p1.getNombre()+"\nEmail: "+p1.getEmail()+"\nPuntuación: "+p1.getPuntuacion()+"\nCursos:"+p1.getCursosOnline().get(0).getNombre());
        System.out.println("\nID curso: "+c1.getId()+"\nID del profesor: "+c1.getProfesor().getId()+"\nNombre profesor: "+c1.getProfesor().getNombre()+"\nNombre del curso: "+c1.getNombre()+"\nVideos del curso: "+c1.getVideos().get(0).getTitulo());
        System.out.println("\nID video: "+v.getId()+"\nTitulo: "+v.getTitulo()+"\nDescripción: "+v.getDescripcion()+"\nOrden: "+v.getOrden()+"\nUrl: "+v.getUrl()+"\nID del curso: "+v.getCursoOnline().getId() +"\nNombre del curso: "+v.getCursoOnline().getNombre());

    }
}
