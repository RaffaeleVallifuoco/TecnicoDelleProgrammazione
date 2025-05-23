package it.raffo.progetto_spring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import it.raffo.progetto_spring.controller.FumetteriaController;
import it.raffo.progetto_spring.controller.MangaController;
import it.raffo.progetto_spring.model.Fumetteria;
import it.raffo.progetto_spring.model.Manga;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class FumetteriaRest {

    @Autowired
    MangaController mangaController;

    @Autowired
    FumetteriaController fumetteriaController;

    public String requestMethodName(@RequestParam String param) {
        return new String();
    }

    @RequestMapping("/index")
    public ModelAndView welcomePage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }

    @RequestMapping("/findAllFumetterie")
    public ModelAndView findAllFumetterie() {
        List<Fumetteria> listaFumetterie = fumetteriaController.findAllFumetterie();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("listaFumetterie", listaFumetterie);
        modelAndView.setViewName("fumetteria.html");
        return modelAndView;
    }

    @RequestMapping("/findAllManga")
    public ModelAndView findAllManga() {
        List<Manga> listaManga = mangaController.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("listaManga", listaManga);
        modelAndView.setViewName("manga.html");
        return modelAndView;
    }

}
