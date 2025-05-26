package access.data_access.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import access.data_access.model.Prodotto;
import access.data_access.service.ProdottoService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProdottoController {

    // @Autowired
    // ProdottoService prodottoService;

    // @RequestMapping("/")
    // public String home(Model model) {
    // List<Prodotto> prodotti = prodottoService.getAllProdotti();

    // model.addAttribute("prodotti", prodotti);

    // return "/home/list";
    // }

    // @RequestMapping("/creaprodotto")
    // public String creaProdotto(Model model) {
    // Prodotto prodotto = new Prodotto();
    // model.addAttribute("prodott", prodotto);
    // return "/form/nuovo-prodotto";
    // }

    // // @moidelattribute è utilizzare per legare direttamente i dati della
    // richiesta
    // // HTTP ai
    // // parametri del metodo controller

    // @RequestMapping("/creaprodotto", method = RequestMethod.POST)
    // public String salvaProdotto(@ModelAttribute("prodott") Prodotto prodotto) {
    // prodottoService.saveProdotto(prodotto);
    // return "/redirect:/";
    // } 

    // @RequestMapping("/prodotto/{id}")
    // public String dettaglioProdotto(@PathVariable Long id, Model model) {

    // Prodotto p = prodottoService.getProdottoById(id);
    // model.addAttribute("prodotto", p);

    // return "prodotto/dettaglio";
    // }

    // @RequestMapping("/aggiorna/{id}")
    // public String aggiornaProdotto(@PathVariable Long id, Model model) {

    // Prodotto p = prodottoService.getProdottoById(id);
    // model.addAttribute("prodotto", p);

    // return "prodotto/aggiorna";
    // }

    // @RequestMapping("/elimina/{id}")
    // public String eliminaProdotto(@PathVariable Long id) {

    // prodottoService.deleteProdottoById(id);

    // return "/redirect:/";

    // }

    @Autowired
    private ProdottoService prodottoService;

    @GetMapping("/")
    public String home(Model model) {
        List<Prodotto> prodotti = prodottoService.getAllProdotti();
        model.addAttribute("prodotti", prodotti);
        return "/home/list";
    }

    @GetMapping("/crea-prodotto")
    public String creaProdotto(Model model) {
        model.addAttribute("prodotto", new Prodotto());
        return "/form/nuovo-prodotto";
    }

    // @ModelAttribute viene usato per legare i dati del form HTML a un oggetto Java
    @PostMapping("/crea-prodotto")
    public String salvaProdotto(@ModelAttribute("prodott") Prodotto prodotto) {
        prodottoService.saveProdotto(prodotto);
        return "redirect:/";
    }

    @GetMapping("/prodotto/{id}")
    public String dettaglioProdotto(@PathVariable Long id, Model model) {
        Prodotto p = prodottoService.getProdottoById(id);
        model.addAttribute("prodotto", p);
        return "prodotto/dettaglio";
    }

    @GetMapping("/aggiorna/{id}")
    public String aggiornaProdotto(@PathVariable Long id, Model model) {
        Prodotto p = prodottoService.getProdottoById(id);
        model.addAttribute("prodotto", p);
        return "prodotto/aggiorna";
    }

    @GetMapping("/elimina/{id}")
    public String eliminaProdotto(@PathVariable Long id) {
        prodottoService.deleteProdottoById(id);
        return "redirect:/";
    }

}
