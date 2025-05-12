package flotta;

import java.time.LocalDate;

public abstract class Veicolo {
    private String modello;
    private String targa;
    private int annoImmatricolazione;
    private Double noleggioGiornaliero;
    private boolean disponibile = true;

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

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    public Veicolo() {

    }

    public Veicolo(String modello, String targa, int annoImmatricolazione, Double noleggioGiornaliero) {
        this.modello = modello;
        this.targa = targa;
        this.annoImmatricolazione = annoImmatricolazione;
        this.noleggioGiornaliero = noleggioGiornaliero;
    }

    public double calcolaNoleggio(int giorni) {
        if (!disponibile) {
            System.out.println("Il veicolo non è disponibile al momento.");
            return 0;
        }
        double costo = giorni * noleggioGiornaliero;
        System.out.println("Costo noleggio per " + giorni + " giorni: " + costo + "€");
        return costo;
    }

    @Override
    public String toString() {
        return "\nDettagli veicolo [modello :\n- " + modello + ",\n targa=" + targa + ",\n annoImmatricolazione="
                + annoImmatricolazione
                + ",\n noleggioGiornaliero=" + noleggioGiornaliero + "]";
    }

}
