package lampadina;

public class Lampadina {

    private Stato stato;
    private int clickEseguiti;
    private int clickMassimi;
    private static boolean presenzaRete;

    private enum Stato {
        ACCESA, SPENTA, ROTTA
    }

    // GETTER & SETTER

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    public int getClickEseguiti() {
        return clickEseguiti;
    }

    public void setClickEseguiti(int clickEseguiti) {
        this.clickEseguiti = clickEseguiti;
    }

    public int getClickMassimi() {
        return clickMassimi;
    }

    public void setClickMassimi(int clickMassimi) {
        this.clickMassimi = clickMassimi;
    }

    public static boolean isPresenzaRete() {
        return presenzaRete;
    }

    public static void setPresenzaRete(boolean presenzaCorrente) {
        presenzaRete = presenzaCorrente;
    }

    // COSTRUTTORI

    public Lampadina() {

    }

    public Lampadina(int clickMassimi) {
        this.clickMassimi = clickMassimi;
        this.clickEseguiti = 0;
        this.stato = Stato.SPENTA;
        this.presenzaRete = true;
    }

    // METODI

    public void click() {
        if (stato == Stato.ROTTA) {
            System.out.println("La lampadina è rotta.");
            return;
        }
        clickEseguiti++;

        if (!presenzaRete) {
            stato = Stato.SPENTA;
            System.err.println("\n- ATTENZIONE_ Impossibile completare l'operazione.\nVerifica presenza rete\n");
            return;
        }

        if (clickEseguiti > clickMassimi) {
            stato = Stato.ROTTA;
        } else {
            switch (stato) {
                case ACCESA -> stato = Stato.SPENTA;
                case SPENTA -> stato = Stato.ACCESA;
                case ROTTA -> stato = Stato.ROTTA;
            }
        }
    }

    public String checkStato() {
        return " " + stato;
    }

    public void spegni() {
        this.stato = Stato.SPENTA;
    }
}
