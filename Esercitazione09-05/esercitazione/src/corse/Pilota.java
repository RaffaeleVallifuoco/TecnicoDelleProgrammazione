package corse;

public class Pilota {

    private String nome;
    private Integer gareVinte;
    private Car vettura;

    // CONSTRUCTORS

    public Pilota() {

    }

    public Pilota(String nome, Integer gareVinte, Car vettura) {
        this.nome = nome;
        this.gareVinte = gareVinte;
        this.vettura = vettura;
    }

    // GETTER & SETTER
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getGareVinte() {
        return gareVinte;
    }

    public void setGareVinte(Integer gareVinte) {
        this.gareVinte = gareVinte;
    }

    public Car getVettura() {
        return vettura;
    }

    public void setVettura(Car vettura) {
        this.vettura = vettura;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Gare vinte: " + gareVinte + ", Vettura: [" + vettura + "]";
    }

}
