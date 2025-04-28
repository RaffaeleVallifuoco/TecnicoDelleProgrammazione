package eserzizio2;

public class Quadrato {

    private double lato;
    private final int numeroLati = 4;

    public int getNumeroLati() {
        return numeroLati;
    }

    public Quadrato(double lato) {
        this.lato = lato;
    }

    public static double perimetro(Quadrato square) {
        double perimetro = square.lato * square.numeroLati;

        return perimetro;
    }

    public static double area(Quadrato square) {

        double area = square.lato * square.lato;
        return area;
    }
}
