package it.raffo.spring_pizza.model;

import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;

public class PizzaRossa {
    private String nome;
    private boolean isRossa;
    private Ordinazione ordinazione;

    public PizzaRossa(String nome, boolean isRossa, Ordinazione ordinazione) {
        this.nome = nome;
        this.isRossa = isRossa;
        this.ordinazione = ordinazione;
    }

    public Ordinazione getOrdinazione() {
        return ordinazione;
    }

    @Resource(name = "pizzaRossa")
    public void setOrdinazione(Ordinazione ordinazione) {
        this.ordinazione = ordinazione;
    }

    public PizzaRossa() {
    }

    public PizzaRossa(String nome) {
        this.nome = nome;
        this.isRossa = true;
    }

    public String getNome() {
        return nome;
    }

    public boolean isRossa() {
        return isRossa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRossa(boolean isRossa) {
        this.isRossa = isRossa;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nome='" + nome + '\'' +
                ", rossa=" + isRossa +
                '}';
    }

    public String ordina() {
        return "\nPizza rossa in arrivo\n";
    }
}
