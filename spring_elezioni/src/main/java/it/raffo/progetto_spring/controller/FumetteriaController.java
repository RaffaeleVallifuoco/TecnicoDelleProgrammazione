package it.raffo.progetto_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import it.raffo.progetto_spring.model.Fumetteria;
import it.raffo.progetto_spring.repository.FumetteriaRepo;

@Controller
public class FumetteriaController {

    @Autowired
    FumetteriaRepo fumetteriaRepo;

    public List<Fumetteria> findAllFumetterie() {
        List<Fumetteria> listaFumetterie = fumetteriaRepo.findAll();
        return listaFumetterie;
    }

    public Fumetteria findById(Integer id) {
        Fumetteria fumetteria = fumetteriaRepo.findById(id).orElse(null);
        return fumetteria;
    }

    public void insert(Fumetteria autore) {
        fumetteriaRepo.save(autore);
    }

}
