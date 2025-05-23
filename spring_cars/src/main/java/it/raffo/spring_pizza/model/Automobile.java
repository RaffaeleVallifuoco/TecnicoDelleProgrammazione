package it.raffo.spring_pizza.model;

public class Automobile {

    private String modello;
    private TipoMotore motore;

    // CONSTRUCTORS

    public Automobile() {
    }

    public Automobile(TipoMotore motore) {
        this.motore = motore;
    }

    public Automobile(String modello, TipoMotore motore) {
        this.modello = modello;
        this.motore = motore;
    }

    // GETTERS & SETTERS

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public TipoMotore getMotore() {
        return motore;
    }

    public void setMotore(TipoMotore motore) {
        this.motore = motore;
    }

    // TOSTRING

    @Override
    public String toString() {
        return "Automobile [modello=" + modello + ", motore=" + motore + "]";
    }

}
