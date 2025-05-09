package telefonia;

public class ContrattoMobile extends ContrattoTelefonico {
    private final Double COSTO_RISPOSTA = 0.02;

    public Double getCOSTO_RISPOSTA() {
        return COSTO_RISPOSTA;
    }

    // CONSTRUCTORS

    public ContrattoMobile(String username, String numero) {
        super(username, numero);
    }

    @Override

    public void calcolaBolletta(double durataChiamata) {
        double importo = (durataChiamata * super.getCOSTO_AL_SECONDO()) + COSTO_RISPOSTA;
        this.setBolletta(importo);

    }
}
