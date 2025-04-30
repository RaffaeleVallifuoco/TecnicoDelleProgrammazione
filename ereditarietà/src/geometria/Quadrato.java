package geometria;

public class Quadrato extends FiguraGeometrica {

    private Double misuraLato;

    // GETTER & SETTER

    public Double getMisuraLato() {
        return misuraLato;
    }

    public void setMisuraLato(Double misuraLato) {
        this.misuraLato = misuraLato;
    }

    // COSTRUTTORI

    public Quadrato() {
    }

    public Quadrato(int numeroLati, String nomeFigura, double misuraLato) {
        super(numeroLati, nomeFigura);
        this.misuraLato = misuraLato;
    }

    // METODI

    @Override
    public Double calcolaArea() {
        // TODO Auto-generated method stub
        return this.misuraLato * this.misuraLato;
    }

    @Override
    public Double calcolaPerimetro() {
        // TODO Auto-generated method stub
        return this.misuraLato * 4;
    }

}
