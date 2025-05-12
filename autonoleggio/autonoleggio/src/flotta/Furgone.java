package flotta;

public class Furgone extends Veicolo {

    private int capacitaDiCarico;

    public int getCapacitaDiCarico() {
        return capacitaDiCarico;
    }

    public void setCapacitaDiCarico(int capacitaDiCarico) {
        this.capacitaDiCarico = capacitaDiCarico;
    }

    public Furgone() {

    }

    public Furgone(String modello, String targa, int annoImmatricolazione, Double noleggioGiornaliero,
            int capacitaDiCarico) {
        super(modello, targa, annoImmatricolazione, noleggioGiornaliero);
        this.capacitaDiCarico = capacitaDiCarico;

    }

    @Override
    public String toString() {
        return super.toString() + ",\ncapacità di carico  : " + this.capacitaDiCarico + "\n";

    }

}
