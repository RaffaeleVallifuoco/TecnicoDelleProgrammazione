package lampadina;

public class Interruttore {

    private Lampadina lampadina;

    // GETTER & SETTER

    public Lampadina getLampadina() {
        return lampadina;
    }

    public void setLampadina(Lampadina lampadina) {
        this.lampadina = lampadina;
    }

    // COSTRUTTORE

    public Interruttore(Lampadina lampadina) {
        this.lampadina = lampadina;
    }

    // METODI

    public void usa() {
        lampadina.click();
    }

    public void checkLampadina() {
        System.out.println(lampadina.checkStato());
    }
}
