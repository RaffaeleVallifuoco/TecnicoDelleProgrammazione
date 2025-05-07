package studente;

public class Magistrale extends Studente {

    private int anniDiCorso = 2;

    public Magistrale(String nome, String cognome, Double isee, int annoCourso) {
        super(nome, cognome, isee, annoCourso);

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
            int anniFuoriCorso = Math.min(super.getAnnoCorso() - anniDiCorso, 2);
            double sovrattassa = baseTassa * 0.15 * anniFuoriCorso;
            return baseTassa + sovrattassa;
        }
    }

    @Override
    public String toString() {
        return "Studente Magistralke: " + super.getNome() + " " + super.getCognome() +
                ", ISEE: " + super.getIsee() +
                ", Anno di Corso: " + super.getAnnoCorso() +
                ", Tassa: " + this.calcolaTassa() + " €";
    }

}
