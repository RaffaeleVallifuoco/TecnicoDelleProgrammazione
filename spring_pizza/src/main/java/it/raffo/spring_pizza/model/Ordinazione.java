package it.raffo.spring_pizza.model;

import org.springframework.stereotype.Component;

public class Ordinazione {

    public String tipo;

    public Ordinazione() {
    }

    public Ordinazione(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Ordinazione [tipo=" + tipo + "]";
    }

    public void ordina() {
        System.out.println("\nSto ordinando...\n");
    }

}
