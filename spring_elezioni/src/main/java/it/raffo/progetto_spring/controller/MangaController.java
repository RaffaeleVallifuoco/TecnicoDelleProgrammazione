package it.raffo.progetto_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import it.raffo.progetto_spring.model.Manga;
import it.raffo.progetto_spring.repository.MangaRepo;

@Controller
public class MangaController {

    @Autowired
    MangaRepo mangaRepo;

    public List<Manga> findAll() {
        List<Manga> listaManga = mangaRepo.findAll();
        return listaManga;
    }

    public Manga findById(Integer id) {
        Manga libro = mangaRepo.findById(id).orElse(null);
        return libro;
    }

    public List<Manga> findAllByidFumetterie(Integer idFumetteria) {
        List<Manga> listaMangaFumetteria = mangaRepo.findAllByIdFumetteria(idFumetteria);
        return listaMangaFumetteria;
    }

    public Manga findByTitolo(String titolo) {
        Manga libro = mangaRepo.findByTitolo(titolo);
        return libro;
    }

    public void insert(Manga libro) {
        mangaRepo.save(libro);
    }

}
