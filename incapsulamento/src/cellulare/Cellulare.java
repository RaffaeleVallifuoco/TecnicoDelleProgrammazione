package cellulare;

public class Cellulare {
    private String numeroTelefono;
    private Double creditoResiduo;
    private String gestoreTelefonico;
    private Double costoChiamata = 1.20;
    private String ultimoChiamato;

    // GETTER & SETTER

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        if (numeroTelefono != null && numeroTelefono.length() == 10) {
            this.numeroTelefono = numeroTelefono;
        } else {
            throw new IllegalArgumentException("Numero inserito non corretto");
        }
    }

    public Double getCreditoResiduo() {
        return creditoResiduo;
    }

    public Double getCostoChiamata() {
        return costoChiamata;
    }

    public String getUltimoChiamato() {
        return ultimoChiamato;
    }

    public String getGestoreTelefonico() {
        return gestoreTelefonico;
    }

    public void setGestoreTelefonico(String gestoreTelefonico) {
        this.gestoreTelefonico = gestoreTelefonico;
    }

    // COSTRUTTORI

    public Cellulare() {

    }

    public Cellulare(String numeroTelefono, Double creditoResiduo, String gestoreTelefonico) {
        setNumeroTelefono(numeroTelefono);
        this.creditoResiduo = creditoResiduo;
        this.gestoreTelefonico = gestoreTelefonico;
    }

    // METODI

    public boolean creditoResiduo() {
        return this.creditoResiduo > 0;
    }

    public boolean checkNumero() {
        return (numeroTelefono != null && numeroTelefono.length() == 10);
    }

    public Double ricaricaCredito(Double importoRicarica) {
        if (importoRicarica > 0) {
            return creditoResiduo += importoRicarica;
        } else
            return creditoResiduo;
    }

    public void chiama(String componiNumero) {
        if (checkNumero()) {
            if (creditoResiduo()) {
                System.out.println(String.format("Sto chiamando %s", componiNumero));
                creditoResiduo -= costoChiamata;
                this.ultimoChiamato = componiNumero;
            } else {
                System.err.println("\n Credito insufficiente \n");
            }
        } else {
            throw new IllegalArgumentException("Numero inserito non valido");
        }
    }

    public void richiama() {
        chiama(ultimoChiamato);
    }

    @Override
    public String toString() {
        return String.format(
                "Numero di telefono: %s%nCredito residuo: %.2f €%nGestore: %s%nUltimo numero chiamato: %s",
                numeroTelefono != null ? numeroTelefono : "Non impostato",
                creditoResiduo != null ? creditoResiduo : 0.0,
                gestoreTelefonico != null ? gestoreTelefonico : "Non impostato",
                ultimoChiamato != null ? ultimoChiamato : "Nessuna chiamata effettuata");
    }

}
