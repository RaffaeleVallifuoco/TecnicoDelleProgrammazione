package eserzizio2;

public class Viaggio {

    public String nomeLocalità;
    public double durataViaggio;
    public double costo;
    private int numeroBiglietti = 20;

    public int getNumeroBiglietti() {
        return numeroBiglietti;
    }

    public Viaggio(String nomeLocalità, double durataViaggio, double costo) {
        this.nomeLocalità = nomeLocalità;
        this.durataViaggio = durataViaggio;
        this.costo = costo;
    }

    public void stampaInfo() {

        System.out.println(String.format("\n Riepèilogo viaggio : \n Meta : %s \n Durata : %f minuti \n Costo : %f",
                this.nomeLocalità, this.durataViaggio, this.costo));
    }

    public void prenota() {

        numeroBiglietti--;
        System.out.println("ticket rimaanenti" + numeroBiglietti);
    }

    public double sconto(int sale) {
        double prezzoScontato = this.costo - (this.costo * sale) / 100;

        return prezzoScontato;
    }

}
