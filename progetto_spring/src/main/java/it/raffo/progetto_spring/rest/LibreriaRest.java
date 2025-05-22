package it.raffo.progetto_spring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import it.raffo.progetto_spring.controller.LibroController;
import it.raffo.progetto_spring.model.Autore;
import it.raffo.progetto_spring.model.Libro;
import it.raffo.progetto_spring.controller.AtoreController;
import it.raffo.progetto_spring.controller.LibroController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class LibreriaRest {

    @Autowired
    LibroController libroController;

    @Autowired
    AtoreController autoreController;

    public String requestMethodName(@RequestParam String param) {
        return new String();
    }

    @RequestMapping("/index")
    public ModelAndView welcomePage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }

    @RequestMapping("/findAllAutori")
    public ModelAndView findAllAutori() {
        List<Autore> listaAutori = autoreController.findAllAutori();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("listaAutori", listaAutori);
        modelAndView.setViewName("autori.html");
        return modelAndView;
    }

    @RequestMapping("/findAllLibri")
    public ModelAndView findAllLibri() {
        List<Libro> listaLibri = libroController.findAllLibri();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("listaLibri", listaLibri);
        modelAndView.setViewName("libri.html");
        return modelAndView;
    }

}
