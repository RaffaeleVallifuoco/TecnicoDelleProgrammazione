package flotta;

public class Automobile extends Veicolo {

    private int numeroDiPosti;

    public int getNumeroDiPosti() {
        return numeroDiPosti;
    }

    public void setNumeroDiPosti(int numeroDiPosti) {
        this.numeroDiPosti = numeroDiPosti;
    }

    public Automobile() {
    }

    public Automobile(String modello, String targa, int annoImmatricolazione, Double noleggioGiornaliero,
            int numeroDiPosti) {
        super(modello, targa, annoImmatricolazione, noleggioGiornaliero);
        this.numeroDiPosti = numeroDiPosti;
    }

    @Override
    public String toString() {
        return super.toString() + ",\nnumero di posti : " + this.numeroDiPosti + "\n";

    }

}
