package it.raffo.progetto_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import it.raffo.progetto_spring.model.Autore;
import it.raffo.progetto_spring.repository.AutoreRepo;

@Controller
@RequestMapping("/autore")
public class AtoreController {

    @Autowired
    AutoreRepo autoreRepo;

    public List<Autore> findAllAutori() {
        List<Autore> listaAutori = autoreRepo.findAll();
        return listaAutori;
    }

    public Autore findById(Integer id) {
        Autore autore = autoreRepo.findById(id).orElse(null);
        return autore;
    }

    public void insert(Autore autore) {
        autoreRepo.save(autore);
    }

}
