package it.raffo.progetto_spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import it.raffo.progetto_spring.model.Persona;
import it.raffo.progetto_spring.model.Seggio;
import it.raffo.progetto_spring.model.TesseraElettorale;
import it.raffo.progetto_spring.repository.PersonaRepo;
import it.raffo.progetto_spring.repository.SeggioRepo;
import it.raffo.progetto_spring.repository.TesseraRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class AppController {

    @Autowired
    PersonaRepo personaRepo;

    @Autowired
    SeggioRepo seggioRepo;

    @Autowired
    TesseraRepo tesseraRepo;

    @GetMapping("/index")
    public String getIndex() {
        return "/index/index";
    }

    @GetMapping("/persone")
    public String peopleIndex(Model model, @RequestParam(name = "name", required = false) String name) {

        List<Persona> peopleList = new ArrayList<>();

        if (name == null) {

            peopleList = personaRepo.findAll();

        } else {

            peopleList = personaRepo.findByNameContainingIgnoreCase(name);
        }

        model.addAttribute("list", peopleList);

        return "/index/persone";
    }

    @GetMapping("/seggi")
    public String seggiIndex(Model model,
            @RequestParam(name = "code", required = false) Integer code,
            @RequestParam(name = "city", required = false) String city) {

        List<Seggio> seggiList = new ArrayList<>();

        if (code == null && city == null) {

            seggiList = seggioRepo.findAll();

        } else if (city == null) {

            seggiList = seggioRepo.findByCode(code);
        } else {

            seggiList = seggioRepo.findByCityContainingIgnoreCase(city);
        }

        model.addAttribute("list", seggiList);

        return "/index/seggi";
    }

    @GetMapping("/tessere")
    public String tessereIndex(Model model,
            @RequestParam(name = "code", required = false) String code,
            @RequestParam(name = "namePersona", required = false) String namePersona) {

        List<TesseraElettorale> tessereList = new ArrayList<>();

        if (code == null && namePersona == null) {

            tessereList = tesseraRepo.findAll();

        } else if (namePersona == null) {

            tessereList = tesseraRepo.findByCodeContainingIgnoreCase(code);
        } else {
            tesseraRepo.findByPersona_NameContainingIgnoreCase(namePersona);
        }

        model.addAttribute("list", tessereList);

        return "/index/tessere";
    }

}
