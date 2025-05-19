package it.raffo.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Residenza {
    private String indirizzo;
    private String cap;
    private String citta;

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    @Override
    public String toString() {
        return "Residenza{" +
                "indirizzo='" + indirizzo + '\'' +
                ", cap='" + cap + '\'' +
                ", citta='" + citta + '\'' +
                '}';
    }
}
