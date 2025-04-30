package geometria;

public abstract class FiguraGeometrica {
    private int numeroLati;
    private String nomeFigura;

    public int getNumeroLati() {
        return numeroLati;
    }

    public String getNomeFigura() {
        return nomeFigura;
    }

    public void setNumeroLati(int numeroLati) {
        this.numeroLati = numeroLati;
    }

    public void setNomeFigura(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }

    public FiguraGeometrica() {

    }

    public FiguraGeometrica(int numeroLati, String nomeFigura) {
        this.numeroLati = numeroLati;
        this.nomeFigura = nomeFigura;
    }

    public abstract Double calcolaArea();

    public abstract Double calcolaPerimetro();

}
