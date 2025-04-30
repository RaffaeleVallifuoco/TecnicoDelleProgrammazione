package geometria;

public class Cerchio extends FiguraGeometrica {
    private double raggio;
    private static final double PI_GRECO = 3.14;

    // GETTER & VSETTER

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    // COSTRUTTORE

    public Cerchio(int numeroLati, String nomeFigura, double raggio) {
        super(numeroLati, nomeFigura);
        this.raggio = raggio;
    }

    // METODI

    @Override
    public Double calcolaArea() {
        // TODO Auto-generated method stub
        return PI_GRECO * this.raggio * this.raggio;

    }

    @Override
    public Double calcolaPerimetro() {
        // TODO Auto-generated method stub
        return 2 * PI_GRECO * this.raggio;

    }
}
