package studente;

public class Studente {
    private String nome;
    private String cognome;
    private Double isee;
    private int annoCorso;

    // GETTER & VSETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Double getIsee() {
        return isee;
    }

    public void setIsee(Double isee) {
        this.isee = isee;
    }

    public int getAnnoCorso() {
        return annoCorso;
    }

    // CONSTRUCTORS

    public void setAnnoCourso(int annoCorso) {
        this.annoCorso = annoCorso;
    }

    public Studente(String nome, String cognome, Double isee, int annoCorso) {
        this.nome = nome;
        this.cognome = cognome;
        this.isee = isee;
        this.annoCorso = annoCorso;
    }

    public Double calcolaTassa() {
        return 500.00;
    }

}
