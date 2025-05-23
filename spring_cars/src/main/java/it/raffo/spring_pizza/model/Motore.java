package it.raffo.spring_pizza.model;

public class Motore {

    public TipoMotore alimentazione;

    // CONSTRUCTORS

    public Motore() {
    }

    public Motore(TipoMotore alimentazione) {
        this.alimentazione = alimentazione;
    }

    // GETTER & SETTER

    public TipoMotore getAlimentazione() {
        return alimentazione;
    }

    public void setAlimentazione(TipoMotore alimentazione) {
        this.alimentazione = alimentazione;
    }

    // TOSTRING

    @Override
    public String toString() {
        return "Motore [alimentazione=" + alimentazione + "]";
    }

}
