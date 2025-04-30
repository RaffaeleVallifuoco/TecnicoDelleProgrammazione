package geometria;

public class Triangolo extends FiguraGeometrica {
    private Double misuraAltezza;
    private Double misuraBase;
    private Double misuraLato1;
    private Double misuraLato2;

    // GETTER & SETTER

    public Double getMisuraAltezza() {
        return misuraAltezza;
    }

    public void setMisuraAltezza(Double misuraAltezza) {
        this.misuraAltezza = misuraAltezza;
    }

    public Double getMisuraBase() {
        return misuraBase;
    }

    public void setMisuraBase(Double misuraBase) {
        this.misuraBase = misuraBase;
    }

    public Double getMisuraLato1() {
        return misuraLato1;
    }

    public void setMisuraLato1(Double misuraLato1) {
        this.misuraLato1 = misuraLato1;
    }

    public Double getMisuraLato2() {
        return misuraLato2;
    }

    public void setMisuraLato2(Double misuraLato2) {
        this.misuraLato2 = misuraLato2;
    }

    // COSTRUTTORE

    public Triangolo(int numeroLati, String nomeFigura, Double misuraAltezza, Double misuraBase, Double misuraLato1,
            Double misuraLato2) {
        super(numeroLati, nomeFigura);
        this.misuraAltezza = misuraAltezza;
        this.misuraBase = misuraBase;
        this.misuraLato1 = misuraLato1;
        this.misuraLato2 = misuraLato2;
    }

    // METODI

    @Override
    public Double calcolaArea() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'calcolaArea'");
        return (this.misuraBase * this.misuraAltezza) / 2;
    }

    @Override
    public Double calcolaPerimetro() {
        // TODO Auto-generated method stub
        return this.misuraBase + this.misuraLato1 + this.misuraLato2;

    }

}
