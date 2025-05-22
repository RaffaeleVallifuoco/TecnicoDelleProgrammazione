package it.raffo.progetto_spring.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import it.raffo.progetto_spring.model.Autore;
import it.raffo.progetto_spring.model.Libro;
import it.raffo.progetto_spring.repository.LibroRepo;

@Controller
@RequestMapping("7libro")
public class LibroController {

    LibroRepo libroRepo;

    public List<Libro> findAllLibri() {
        List<Libro> listaLibri = libroRepo.findAll();
        return listaLibri;
    }

    public Libro findById(Integer id) {
        Libro libro = libroRepo.findById(id).orElse(null);
        return libro;
    }

    public List<Libro> findAllByidAutore(Integer idAutore) {
        List<Libro> listaLibriAutore = libroRepo.findAllByIdAutore(idAutore);
        return listaLibriAutore;
    }

    public Libro findByTitolo(String titolo) {
        Libro libro = libroRepo.findByTitolo(titolo);
        return libro;
    }

    public void insert(Libro libro) {
        libroRepo.save(libro);
    }

}
