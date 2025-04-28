public class Animale {

    String nome;
    String specie;
    String verso;
    String peso;
}

    public Animale(String nome, String specie, String verso, int peso) {
        this.nome = nome;
        this.specie = specie;
        this.verso = verso;
        this.peso = peso;
    }

public void faiVerso () {
    System.out.println(String.format("Ciao, sono un %s e il mio verso è : %s", nome, verso));
}
