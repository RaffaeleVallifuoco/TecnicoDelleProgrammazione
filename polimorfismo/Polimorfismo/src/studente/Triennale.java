package studente;

public class Triennale extends Studente {

    private int anniDiCorso = 3;

    public Triennale(String nome, String cognome, Double isee, int annoCorso) {
        super(nome, cognome, isee, annoCorso);

    }

    private boolean isInCorso() {
        return super.getAnnoCorso() <= anniDiCorso;
    }

    @Override
    public Double calcolaTassa() {
        double baseTassa;

        if (super.getIsee() <= 10000) {
            baseTassa = 500.00;
        } else if (super.getIsee() >= 10000 && super.getIsee() <= 30000) {
            baseTassa = 700.00;
        } else {
            baseTassa = 1200.00;
        }

        if (isInCorso()) {
            return baseTassa;
        } else {
            int anniFuoriCorso = Math.min(super.getAnnoCorso() - anniDiCorso, 3);
            double sovrattassa = baseTassa * 0.10 * anniFuoriCorso;
            return baseTassa + sovrattassa;
        }
    }

    @Override
    public String toString() {
        return "Studente Triennale: " + super.getNome() + " " + super.getCognome() +
                ", ISEE: " + super.getIsee() +
                ", Anno di Corso: " + super.getAnnoCorso() +
                ", Tassa: " + this.calcolaTassa() + " €";
    }

}
