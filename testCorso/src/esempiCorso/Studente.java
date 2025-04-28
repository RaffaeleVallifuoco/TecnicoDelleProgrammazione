package esempiCorso;

// il filke puo avere una classe public al suo interno, posso avere tutte le classi che voglio ma una sola puo essere pubblica.
// il nome del fille java avrà il nome della classe pubblica

public class Studente {

    // variabili di istanza

    public String nome;
    public int age;
    public String corsoDiStudi;

    // variabili di classe comuni a tutti gli oggetti istanziati

    public static int numeroOre = 250;

    public Studente(String nome, int age, String corsoDiStudi) {

        this.nome = nome;
        this.age = age;
        this.corsoDiStudi = corsoDiStudi;
    }

}