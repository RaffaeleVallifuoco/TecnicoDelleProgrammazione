package telefonia;

public class ContrattoTelefonico {

    private String username;
    private String numero;
    private Double bolletta;
    private final Double COSTO_AL_SECONDO = 0.04;
    private Double durataChiamata;

    // CONSTRUCTORS

    public ContrattoTelefonico() {

    }

    public ContrattoTelefonico(String username, String numero) {
        this.username = username;
        this.numero = numero;
    }

    // GETTER & SETTER

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getBolletta() {
        return bolletta;
    }

    public void setBolletta(Double bolletta) {
        this.bolletta = bolletta;
    }

    public Double getCOSTO_AL_SECONDO() {
        return COSTO_AL_SECONDO;
    }

    public Double getDurataChiamata() {
        return durataChiamata;
    }

    // METHODS

    public void telefona(double durataChiamata) {
        this.durataChiamata = durataChiamata;
        calcolaBolletta(durataChiamata);
    }

    public void calcolaBolletta(double durataChiamata) {
        double importo = durataChiamata * COSTO_AL_SECONDO;
        this.setBolletta(importo);

    }

}
