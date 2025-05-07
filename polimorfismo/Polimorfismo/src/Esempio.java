public class Esempio {
    public String testo;
    public String testoAggiuntivo;
    public int numero;

    public Esempio(String testo) {
        this.testo = testo;

    }

    public Esempio(String testo, int numero) {
        this.testo = testo;
        this.numero = numero;

    }

    public Esempio(String testo, String testoAggiuntivo, int numero) {
        this.testo = testo;
        this.numero = numero;
        this.testoAggiuntivo = testoAggiuntivo;

    }

}
