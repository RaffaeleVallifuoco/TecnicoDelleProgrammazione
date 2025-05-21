package it.raffo.spring_pizza.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;

public class PizzaBianca {
    private String nome;
    private boolean isRossa;

    @Resource(name = "pizzaBianca")
    private Ordinazione ordinazione;

    public PizzaBianca() {
    }

    public PizzaBianca(String nome) {
        this.nome = nome;
        this.isRossa = false;
    }

    public PizzaBianca(String nome, boolean isRossa, Ordinazione ordinazione) {
        this.nome = nome;
        this.isRossa = isRossa;
        this.ordinazione = ordinazione;
    }

    public PizzaBianca(Ordinazione ordinazione) {
        this.ordinazione = ordinazione;
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

    public Ordinazione getOrdinazione() {
        return ordinazione;
    }

    public void setOrdinazione(Ordinazione ordinazione) {
        this.ordinazione = ordinazione;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nome='" + nome + '\'' +
                ", rossa=" + isRossa +
                '}';
    }

    public String ordina() {
        return "\nPizza bianca in arrivo\n";
    }

}
