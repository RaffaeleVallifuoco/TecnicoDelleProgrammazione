package mondoReale;

public class Albero {

    private String tipo;
    private String specie;
    private int numeroRami;
    private String habitat;

    public Albero() {

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public int getNumeroRami() {
        return numeroRami;
    }

    public void setNumeroRami(int numeroRami) {
        this.numeroRami = numeroRami;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Albero(String tipo, String specie, String habitat, int numeroRami) {
        this.tipo = tipo;
        this.specie = specie;
        this.habitat = habitat;
        this.numeroRami = numeroRami;

    }

}
