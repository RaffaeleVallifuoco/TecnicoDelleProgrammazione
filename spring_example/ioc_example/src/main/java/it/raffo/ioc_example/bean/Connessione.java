package it.raffo.ioc_example.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Connessione {
    private String tipo;

    public Connessione() {
        this.tipo = "base";

    }

    public Connessione(String tipo) {
        this.tipo = tipo;
    }

    public String login() {
        return "Connessione in corso....";
    }

    @PostConstruct
    public void metodoPostConstruct() {
        System.out.println("\nBean connessione appena creato\n");
    }

    @PreDestroy
    public void metodoOreDestroy() {
        System.out.println("\nBean connessione sta per essere distrutto\n");
    }

}
