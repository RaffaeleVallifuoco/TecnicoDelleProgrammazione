package flotta;

import java.time.LocalDate;

public abstract class Veicolo {
    private String modello;
    private String targa;
    private int annoImmatricolazione;
    private Double noleggioGiornaliero;

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }

    public void setAnnoImmatricolazione(int annoImmatricolazione) {
        this.annoImmatricolazione = annoImmatricolazione;
    }

    public Double getNoleggioGiornaliero() {
        return noleggioGiornaliero;
    }

    public void setNoleggioGiornaliero(Double noleggioGiornaliero) {
        this.noleggioGiornaliero = noleggioGiornaliero;
    }

    public Veicolo() {

    }

    public Veicolo(String modello, String targa, int annoImmatricolazione, Double noleggioGiornaliero) {
        this.modello = modello;
        this.targa = targa;
        this.annoImmatricolazione = annoImmatricolazione;
        this.noleggioGiornaliero = noleggioGiornaliero;
    }

    public void calcolaNoleggio(int numeroDigiorni) {
        Double costoNoleggio = numeroDigiorni * this.noleggioGiornaliero;
        System.out.println("\nIl costo del noleggio del veicolo richiesto per i giorni inseriti ammonta a : "
                + costoNoleggio + " €");
    }

    @Override
    public String toString() {
        return "\nDettagli veicolo [modello :\n- " + modello + ",\n targa=" + targa + ",\n annoImmatricolazione="
                + annoImmatricolazione
                + ",\n noleggioGiornaliero=" + noleggioGiornaliero + "]";
    }

}
