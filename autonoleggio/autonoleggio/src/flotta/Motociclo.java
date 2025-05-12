package flotta;

public class Motociclo extends Veicolo {
    private int cilindrata;

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public Motociclo() {
    }

    public Motociclo(String modello, String targa, int annoImmatricolazione, Double noleggioGiornaliero,
            int cilindrata) {
        super(modello, targa, annoImmatricolazione, noleggioGiornaliero);
        this.cilindrata = cilindrata;
    }

    @Override
    public String toString() {
        return super.toString() + ",\ncilindrata  : " + this.cilindrata + "\n";

    }

}
